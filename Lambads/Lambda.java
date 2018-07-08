package Lambda;

import java.io.File;
import java.io.FileFilter;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileFilter filter = new FileFilter() {

			@Override
			public boolean accept(File pathName) {
				// TODO Auto-generated method stub
				return pathName.getName().endsWith(".java");
			}

		};
		
		File dir = new File("d:/tmp");
		File[] files=dir.listFiles(filter);
		
		for(File f:files)
		{
			System.out.println(f.getName());
		}
	}

}
