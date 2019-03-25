package JavaBasic;

import java.io.File;

public class Test_File {
    public static void main(String[] args) {
        File file = new File("E:\\Baodian\\src\\testDir");
        //判断目录是否存在
        if (!file.exists()) {
            System.out.println("directory does not exist");
        }
        File[] fileList = file.listFiles();
        if(fileList.length == 0){
            System.out.println("directory is empty");
        }
        for (int i = 0; i < fileList.length; i++) {
            // 判断是否为目录
            if (fileList[i].isDirectory()) {
                System.out.println("directory is: " + fileList[i].getName());
            } else {
                System.out.println("file is: " + fileList[i].getName());
            }
        }
    }
}
