import java.io.File;
// Creates the FileExtension options and description for the program
public class FileNameExtensionFilter extends file_chooser{
        String extension;
        String description;
public FileNameExtensionFilter(String extension,String description){
        this.extension=extension;
        this.description = description;
        }
public boolean accept(File f){
        if(f.isDirectory()){
        return true;
        }
        return f.getName().endsWith(extension);
        }
public String getDescription(){
        return description+String.format(" (*%s)",extension);
        }
}





