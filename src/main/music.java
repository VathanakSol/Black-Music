package main;//Music can play with mp3

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

import java.io.File;
import java.io.IOException;

public class music {
    public static void main(String[] args) {
        File mp3File = new File("D:/M-Fatt - Empty ft. Tendo (Official Audio).mp3");

        try {
            System.out.println("Attempting to read the MP3 file...");
            AudioFile audioFile = AudioFileIO.read(mp3File);
            System.out.println("MP3 file read successfully.");

            long durationInSeconds = getMP3Duration(audioFile);
            System.out.println("Duration: " + durationInSeconds + " seconds");
        } catch (CannotReadException | IOException | TagException | InvalidAudioFrameException e) {
            System.err.println("Error reading the MP3 file:");
            e.printStackTrace();
        } catch (ReadOnlyFileException e) {
            throw new RuntimeException(e);
        }
    }

    private static long getMP3Duration(AudioFile audioFile)
    {
        return audioFile.getAudioHeader().getTrackLength();
    }
}
