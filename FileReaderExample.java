import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample{
	//Today we're reading a file and printing it's contents. Using while loop to help facilitate this process
	public static void main(String[] args){
		BufferedReader fileOjbReader = null;
		//seem like this is the proper flow to initialize
		try{
			String strCurrentLine; //felt like renaming this to set
			fileOjbReader = new BufferedReader(new FileReader("c:\\Data1.txt"));
			//first time I used the new Keyword twice in this fashion

			while((strCurrentLine = fileOjbReader.readLine()) != null){
				System.out.println(strCurrentLine);
			}
		}
		catch (IOException e){
			e.printStackTrace();
			//First time usage of this, look up later
		}
		finally{
			try {
				if (fileOjbReader != null)
					fileOjbReader.close();
			}
			catch (IOException ex){
				ex.printStackTrace();
			}
		}
	}
}

//if I change the printStackTrace() to println(), my output will be as followed:
//
//			java.io.FileNotFoundException: c:\Dat1.txt (The system cannot find the file specified)

/*  This output was generate via eclipse while original code was done via command line.  */