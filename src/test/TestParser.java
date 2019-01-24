package test;

import org.apache.tika.metadata.Metadata;
import services.AudioParser;
import services.FileParser;

import java.util.*;

public class TestParser
{
    public static Metadata testAudioParser(String musicFile)
    {
//        String musicFile = "src/musiques/alter_bridge-blackbird/01-Ties-That-Bind.mp3";
        return AudioParser.getMusicData(musicFile);
    }

    public static void testFileParser()
    {
        String folderPath = "src/musiques/alter_bridge-blackbird";
        FileParser.getListOfFiles(folderPath);
    }

    public static List<Metadata> testParser()
    {
        String folderPath = "src/musiques/alter_bridge-blackbird";
        List<String> listFilePath = FileParser.getListOfFiles(folderPath);
        List<Metadata> listMetadata = new ArrayList<>();
        for (String filePath : listFilePath)
        {
            listMetadata.add(AudioParser.getMusicData(folderPath + "/" + filePath));
        }

        System.out.println(listMetadata);
        return listMetadata;
    }

    public static Map<String, List<String>> getFoldersFilesMap()
    {
        String musicFolderPath = "src/musiques";
        Map <String, List<String>> folderFilesMap = new HashMap<>();
        Map<String, Metadata> fileDataMap = new HashMap<>();

        List<String> listFolderPath = FileParser.getListOfFolder(musicFolderPath);
//        System.out.println(listFolderPath);
        List<String> listFile;

        for(String folder : listFolderPath)
        {
            listFile = FileParser.getListOfFiles(musicFolderPath + "/" + folder);
//            System.out.println(folder + "\t" + listFile);
            folderFilesMap.put(folder,listFile);
        }

//        System.out.println(folderFilesMap);

        return folderFilesMap;
    }


    public static Map<String, Metadata> getMusicDataMap(Map <String, List<String>> folderFilesMap)
    {
        Map<String, Metadata> musicDataMap = new HashMap<>();
//        List<String> locationFiles = new ArrayList<>();

        for(String folder : folderFilesMap.keySet())
        {
            for (String file : folderFilesMap.get(folder))
            {
//                locationFiles.add(folder + "/" + file);
                musicDataMap.put(folder + "/" + file,AudioParser.getMusicData("src/musiques/" + folder + "/" + file));
            }
        }
        return musicDataMap;
    }


    public static void recuperationAlbums()
    {
        List<Metadata> listMetadata = testParser();
        for (Metadata metadata : listMetadata)
        {
            if(metadata.get("title") != null)
            {
                System.out.println("----------------------------------------------");
                System.out.println("Title: " + metadata.get("title"));
                System.out.println("Artists: " + metadata.get("xmpDM:artist"));
//                System.out.println("Composer : " + metadata.get("xmpDM:composer"));
                System.out.println("Genre : " + metadata.get("xmpDM:genre"));
                System.out.println("Album : " + metadata.get("xmpDM:album"));
            }
        }
    }
}
