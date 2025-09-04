package fileTest;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		String rootPath = "C:/file/";

		File directory = new File(rootPath);
        if(!directory.exists()){
        	System.out.println("존재안함");
            directory.mkdirs();
            return;
        }
        System.out.println(directory.getAbsolutePath());
        System.out.println("존재");

	}
}
