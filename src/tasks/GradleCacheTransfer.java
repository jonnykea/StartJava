package tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class GradleCacheTransfer {
    private static final boolean logging = true;
    private static final String src = "C:\\Users\\kochukov.e\\.gradle\\caches\\modules-2\\files-2.1";
    private static final String dst = "C:\\Users\\kochukov.e\\Desktop\\testGroovyScript\\dst";

    private static int groupCount = 0;
    private static int artifactCount = 0;

    public static void main(String[] args) {
        try {
            Files.list(Paths.get(src))
                    .forEach(GradleCacheTransfer::processGroup);

            System.out.println("Done!");
            System.out.println("Total " + groupCount + " groups");
            System.out.println("Total " + artifactCount + " artifacts");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processGroup(Path groupPath) {
        groupCount++;
        String groupDir = groupPath.getFileName().toString().replace(".", "/");
        if (logging) {
            System.out.println(groupDir);
        }
        makeDirs(Paths.get(dst, groupDir));

        try {
            Files.list(groupPath)
                    .forEach(artifactPath -> processArtifact(groupDir, artifactPath.getFileName().toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processArtifact(String groupDir, String artifact) {
        artifactCount++;
        Path artifactDir = Paths.get(dst, groupDir, artifact);
        makeDirs(artifactDir);
        if (logging) {
            System.out.println(artifact);
        }

        Path srcArtifactDir = Paths.get(src, groupDir, artifact);
        try {
            Files.list(srcArtifactDir)
                    .forEach(versionPath -> processVersion(groupDir, artifact, artifactDir, versionPath.getFileName().toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processVersion(String groupDir, String artifact, Path artifactDir, String version) {
        Path versionDir = Paths.get(artifactDir.toString(), version);
        makeDirs(versionDir);
        if (logging) {
            System.out.println(version);
        }

        Path srcVersionDir = Paths.get(src, groupDir, artifact, version);
        try {
            Files.list(srcVersionDir)
                    .forEach(hashDir -> processHash(versionDir, hashDir));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processHash(Path versionDir, Path hashDir) {
        try {
            Files.list(hashDir)
                    .forEach(file -> {
                        Path srcFilePath = hashDir.resolve(file.getFileName());
                        Path dstFilePath = versionDir.resolve(file.getFileName());
                        copyFile(srcFilePath, dstFilePath);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(Path srcFilePath, Path dstFilePath) {
        try {
            Files.copy(srcFilePath, dstFilePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void makeDirs(Path path) {
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


