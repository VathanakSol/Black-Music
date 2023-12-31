package main;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.Console;


public class mediaPlayer {
    static Scanner scanner = new Scanner(System.in);
    private static Clip clip;
    private static boolean isPlaying = false;

    private static long getMP3Duration(AudioFile audioFile)
    {
        return audioFile.getAudioHeader().getTrackLength();
    }


    static int choice;

    //music method
    public static void music(){
        System.out.println("                          Welcome to Black Music                           ");
        System.out.println("==========================================================================");
        System.out.println("||                                                                      ||");
        System.out.println("||      1. Music        2. Playlist         3. About        4. Exit\t\t||");
        System.out.println("||                                                                      ||");
        System.out.println("==========================================================================");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        if(choice == 2){
            playList();
        }if(choice == 3){
            about();
        }if(choice == 4){
            System.out.println("Exiting...");
            System.exit(0);
        }
    }

    //music playlist method
    public static void playList(){
        System.out.println("            Music Category              ");
        System.out.println("---------------Chill---------------");
        System.out.println("1. Call Me PaPa");
        System.out.println("2. Shape of You");
        System.out.println("3. Empty");
        System.out.println("4. Blank");
        System.out.println("5. Angel Baby");
        System.out.println("-----------------------------------");


        System.out.println("            ->  Press 0 to Back  <-            ");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        if(choice == 0){
            music();
        }if(choice == 1){
            
        }


    }



    //about method
    public static void about(){
        System.out.println("Black Music is an console application that can play music by using java. This software is contributed and develop by:");
        System.out.println("        Sorn Pisey - BackEnd Developer");
        System.out.println("        Sol Vathanak - BackEnd Developer");
        System.out.println("        Ngim Sovanntana - System Analysis");
        System.out.println("        Heng Sothib - UI/UX Console Designer");
        System.out.println("        Phiv Lyhou - Database Maintenance");
        System.out.println("        Na Sreytey - Tester");
        System.out.println("        Channtha Seamey - Database Maintenance");
        System.out.println("        Created in 2023\t\t\tCopyright by: Group 3 CSTAD");
        System.out.println("            ->  Press 0 to Back  <-            ");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        if(choice == 0){
            music();
        }
    }

    public static void main(String[] args) {

        int choice_a, choice_b, choice_c;

        System.out.println("Console Music Player");

        music();



            switch(choice){
                case 1:
                    System.out.println("===============Music================= ");

                    System.out.println("    -> Press 0 to back  <-    ");
                    System.out.print("Choose an option: ");
                    choice = scanner.nextInt();
                    if(choice == 0){
                        music();
                    }
//                    System.out.print("Choose which one do you want to listen?: ");
//                    int choice2 = scanner.nextInt();
//                    switch(choice2){
//                        case 1:
//
//                            System.out.println("1. Play Music");
//                            System.out.println("2. Pause Music");
//                            System.out.println("3. Stop Music");
//                            System.out.println("4. Exit");
//
//                            System.out.print("Choose an option: ");
//                            choice_a = scanner.nextInt();
//
//                            switch (choice_a) {
//                                case 1:
//                                    File mp3File = new File("D:/Baby.wav");
//
//
//                                    //duration of song
//                                    try {
//                                        System.out.println("Attempting to read the MP3 file...");
//                                        AudioFile audioFile = AudioFileIO.read(mp3File);
//                                        System.out.println("MP3 file read successfully.");
//
//                                        long durationInSeconds = getMP3Duration(audioFile);
//                                        System.out.println("Duration: " + durationInSeconds + " seconds");
//                                    } catch (CannotReadException | IOException | TagException | InvalidAudioFrameException e) {
//                                        System.err.println("Error reading the MP3 file:");
//                                        e.printStackTrace();
//                                    } catch (ReadOnlyFileException e) {
//                                        throw new RuntimeException(e);
//                                    }
//                                    //---------------------------------------------------------
//
//                                    playMusic("D:/Baby.wav");
//                                break;
//                                case 2:
//                                    pauseMusic();
//                                    break;
//                                case 3:
//                                    stopMusic();
//                                    break;
//                                case 4:
//                                    System.out.println("Exiting...");
//                                    System.exit(0);
//                                    break;
//                                default:
//                                    System.out.println("Invalid choice. Try again.");
//                            }
//
//                                break;
//                        case 2:
//                            System.out.println("1. Play Music");
//                            System.out.println("2. Pause Music");
//                            System.out.println("3. Stop Music");
//                            System.out.println("4. Exit");
//
//                            System.out.print("Choose an option: ");
//                            choice_b = scanner.nextInt();
//
//                            switch (choice_b) {
//                                case 1:
//                                    //duration
//                                    File mp3File = new File("D:remix.wav");
//
//                                    try {
//                                        System.out.println("Attempting to read the MP3 file...");
//                                        AudioFile audioFile = AudioFileIO.read(mp3File);
//                                        System.out.println("MP3 file read successfully.");
//
//                                        long durationInSeconds = getMP3Duration(audioFile);
//                                        System.out.println("Duration: " + durationInSeconds + " seconds");
//                                    } catch (CannotReadException | IOException | TagException | InvalidAudioFrameException e) {
//                                        System.err.println("Error reading the MP3 file:");
//                                        e.printStackTrace();
//                                    } catch (ReadOnlyFileException e) {
//                                        throw new RuntimeException(e);
//                                    }
//
//
//
//                                    playMusic("D:/remix.wav");
//                                    break;
//                                case 2:
//                                    pauseMusic();
//                                    break;
//                                case 3:
//                                    stopMusic();
//                                    break;
//                                case 4:
//                                    System.out.println("Exiting...");
//                                    System.exit(0);
//                                    break;
//                                default:
//                                    System.out.println("Invalid choice. Try again.");
//                            }
//                            break;
//                        case 3:
//                            System.out.println("1. Play Music");
//                            System.out.println("2. Pause Music");
//                            System.out.println("3. Stop Music");
//                            System.out.println("4. Exit");
//
//                            System.out.print("Choose an option: ");
//                            choice_c = scanner.nextInt();
//
//                            switch (choice_c) {
//                                case 1:
//                                    //duration
//                                    File mp3File = new File("D:/M-Fatt - Empty ft. Tendo (Official Audio).wav");
//
//                                    try {
//                                        System.out.println("Attempting to read the MP3 file...");
//                                        AudioFile audioFile = AudioFileIO.read(mp3File);
//                                        System.out.println("MP3 file read successfully.");
//
//                                        long durationInSeconds = getMP3Duration(audioFile);
//                                        System.out.println("Duration: " + durationInSeconds + " seconds");
//                                    } catch (CannotReadException | IOException | TagException | InvalidAudioFrameException e) {
//                                        System.err.println("Error reading the MP3 file:");
//                                        e.printStackTrace();
//                                    } catch (ReadOnlyFileException e) {
//                                        throw new RuntimeException(e);
//                                    }
//
//
//
//                                    playMusic("D:/M-Fatt - Empty ft. Tendo (Official Audio).wav");
//                                    break;
//                                case 2:
//                                    pauseMusic();
//                                    break;
//                                case 3:
//                                    stopMusic();
//                                    break;
//                                case 4:
//                                    System.out.println("Exiting...");
//                                    System.exit(0);
//                                    break;
//                                default:
//                                    System.out.println("Invalid choice. Try again.");
//                            }
//                            break;
//                        default:
//
//                    }
//                    break;
                case 2:
                    System.out.println("==============Playlist================");
                    playList();

                    break;
                case 3:
                    System.out.println("================About================");
                    about();

                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                    break;
                default:


            }

            //Control Panel display after user click play music
//            System.out.println("||===============Control Panel===============||");
//            System.out.println("||\t\t1. Play Music\t\t\t\t\t\t ||");
//            System.out.println("||\t\t2. Pause Music\t\t\t\t\t\t ||");
//            System.out.println("||\t\t3. Stop Music\t\t\t\t\t\t ||");
//            System.out.println("||\t\t4. Back\t\t\t\t\t\t\t\t ||");
//            System.out.println("||===========================================||");
//
//            System.out.print("Choose an option: ");
//            choice_c = scanner.nextInt();
//            switch(choice_c){
//                case 1:
//                    playMusic("D:/M-Fatt - Empty ft. Tendo (Official Audio).wav");
//                    break;
//                case 2:
//                    pauseMusic();
//                    break;
//                case 3:
//                    stopMusic();
//                    break;
//                case 4:
//                    System.out.println("Exiting...");
//                    System.exit(0);
//                    break;
//            }

    }

    private static void handleArrowKey(char arrowKey) {
    }

    private static void playMusic(String filePath) {
        try {
            File file = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            isPlaying = true;
            System.out.println("Playing: " + file.getName());
            System.out.println("\n---------------Enjoy Listening--------------\n");
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private static void pauseMusic() {
        if (isPlaying && clip != null && clip.isRunning()) {
            clip.stop();
//            isPlaying = false;
            System.out.println("Music paused");
        } else {
            System.out.println("No main.music is currently playing.");
        }
    }

    private static void stopMusic() {
        if (clip != null) {
            clip.stop();
            clip.close();
            isPlaying = false;
            System.out.println("Music stopped");
        } else {
            System.out.println("No main.music is currently playing.");
        }
    }
    int consoleWidth = 40;  // Adjust based on your console width
    int ballPosition = 0;
    int direction = 1;
}
