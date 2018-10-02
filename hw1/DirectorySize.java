//Joey Colaizzo, 111554364
import java.io.File;
import java.util.LinkedList;
public class DirectorySize{
	public static int getSize(File directory){
		int size = 0;
		LinkedList<File> subDirectories = new LinkedList<>();
		subDirectories.offer(directory);
		while(!subDirectories.isEmpty()){
			File dir = subDirectories.poll();
			for(File f : dir.listFiles()){
				if(f.isDirectory())
					subDirectories.offer(f);
				else size += f.length();
			}
		}
		return size;
	}

	public static void main(String[] args){
		System.out.println(getSize(new File("/Users/Joey/Desktop/Fall_2018/CSE337")));
	}
}