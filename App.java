[33mtag v0.1[m
Tagger: yanawut pomkaew <AnathamPK@gmail.com>
Date:   Fri Jun 23 09:23:38 2023 +0700

my version 0.1

[33mcommit 2b725a6902870040678ba8dc183896a0e77fdba2[m[33m ([m[1;36mHEAD -> [m[1;32mmain[m[33m, [m[1;33mtag: v0.1[m[33m, [m[1;31morigin/main[m[33m)[m
Author: yanawut pomkaew <AnathamPK@gmail.com>
Date:   Fri Jun 23 08:48:00 2023 +0700

    Add Student Class

[1mdiff --git a/bin/App.class b/bin/App.class[m
[1mindex 3fc560a..bf49860 100644[m
Binary files a/bin/App.class and b/bin/App.class differ
[1mdiff --git a/bin/Student.class b/bin/Student.class[m
[1mnew file mode 100644[m
[1mindex 0000000..681be42[m
Binary files /dev/null and b/bin/Student.class differ
[1mdiff --git a/src/App.java b/src/App.java[m
[1mindex e392ca8..14eb972 100644[m
[1m--- a/src/App.java[m
[1m+++ b/src/App.java[m
[36m@@ -1,5 +1,26 @@[m
[32m+[m[32mimport java.util.ArrayList;[m
[32m+[m
 public class App {[m
     public static void main(String[] args) {[m
[31m-        System.out.println("Hello, World!");[m
[32m+[m
[32m+[m[32m        ArrayList<String> students = new ArrayList<String>();[m
[32m+[m[41m        [m
[32m+[m[32m        Student student = new Student();[m
[32m+[m
[32m+[m[32m        student.setName("Yanawut");[m
[32m+[m[32m        System.out.println(student.getName());[m
[32m+[m
[32m+[m[32m        students.add(student.getName());[m
[32m+[m
[32m+[m[32m        student.setName("ice");[m
[32m+[m[32m        System.out.println(student.getName());[m
[32m+[m[32m        students.add(student.getName());[m
[32m+[m[41m        [m
[32m+[m[41m        [m
[32m+[m[32m        for(int i = 0 ; i< students.size() ; ++i) {[m
[32m+[m[32m            System.out.print(students.get(i) + ", ");[m
[32m+[m[41m            [m
[32m+[m[32m        }[m
[32m+[m
     }[m
 }[m
[1mdiff --git a/src/Student.java b/src/Student.java[m
[1mnew file mode 100644[m
[1mindex 0000000..1f35e73[m
[1m--- /dev/null[m
[1m+++ b/src/Student.java[m
[36m@@ -0,0 +1,15 @@[m
[32m+[m[32mpublic class Student {[m
[32m+[m[41m    [m
[32m+[m[32m    private String name;[m
[32m+[m[41m   [m
[32m+[m[32m    public void setName(String name) {[m
[32m+[m[32m        this.name = name;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getName() {[m
[32m+[m[32m        return this.name;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[41m    [m
[32m+[m
[32m+[m[32m}[m
