package services;

import java.io.File;
import java.util.*;

public class FileParser
{
    public static List<String> getListOfFiles(String folderLocation)
    {
        List<String> results = new ArrayList<>();
        File[] files = new File(folderLocation).listFiles();

        for (File file : files)
        {
            if (file.isFile())
            {
                results.add(file.getName());
            }
        }
//        System.out.println(results);
        return results;
    }

    public static List<String> getListOfFolder(String folderLocation)
    {
        File folder = new File(folderLocation);
        List<String> listFolder = new ArrayList<>();

        for (File fileEntry : folder.listFiles())
        {
            if (fileEntry.isDirectory())
            {
                listFolder.add(fileEntry.getName());
            }
        }
        return listFolder;
    }
}
