package com.flexon.apple;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

public class FileSystemBFSInParallel {
    public static void main(String[] args) throws Exception{
        FileSystemBFSInParallel fsbfs = new FileSystemBFSInParallel();
        //, Pattern.compile("Mock")
        String pattern = "**.java";
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
        List<File> files1 = new ArrayList<>();
        List<File> files2 = new ArrayList<>();
        List<File> files = new ArrayList<>();
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<>();


        files1.add(new File("/Users/junyuliu/Flexon"));
        files2.add(new File("/Users/junyuliu/Laioffer"));
        files.add(new File("/Users/junyuliu/Flexon"));
        files.add(new File("/Users/junyuliu/Laioffer"));

        long curTime1 = System.currentTimeMillis();
        fsbfs.bfs(list1, files, matcher);
        System.out.println(System.currentTimeMillis() - curTime1);

        long curTime2 = System.currentTimeMillis();
        MyThread t0 = new MyThread(list2, files1);
        MyThread t1 = new MyThread(list2, files2);
        t0.start();
        t1.start();
        t0.join();
        t1.join();
        System.out.println(System.currentTimeMillis() - curTime2);

    }

    public List<String> bfs(CopyOnWriteArrayList<String> list, List<File> inputDirectory, PathMatcher matcher){
        List<String> res = new ArrayList<>();
        //        String pattern = "**.java";
//        Pattern pattern = Pattern.compile("Mock");


        Queue<File> queue = new LinkedList<>(inputDirectory);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                File cur = queue.poll();
//                assert cur != null;
                File[] fileDirList = cur.listFiles();
                if (fileDirList != null){
                    for (File f : fileDirList){
                        //if match the regular expression, save it
//                        boolean flag = pattern.matcher(f.getName()).find();
                        if (f.isDirectory()){
                            queue.offer(f);
                        }
//                        System.out.println(f.toPath());
                        if (matcher.matches(f.toPath())){//(matcher.matches(f.toPath())){
                            list.add(f.toString());
//                            System.out.println(f);
                        }
                    }
                }
            }
        }
        return res;
    }
}


class MyThread extends Thread {
    CopyOnWriteArrayList<String> list;
    List<File> files;

    MyThread(CopyOnWriteArrayList<String> list, List<File> files) {
        this.list = list;
        this.files = files;
    }

    @Override
    public void run() {
        FileSystemBFSInParallel fsbfs = new FileSystemBFSInParallel();
        String pattern = "**.java";
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);

        fsbfs.bfs(list, files, matcher);

        Thread t = currentThread();
        System.out.println(t.getName() + list);
    }
}

class Node{
    List<File> files;
    List<Node> subNode;

    public Node(List<File> files){
        this.files = files;
    }
}