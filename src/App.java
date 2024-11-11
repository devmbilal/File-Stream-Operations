import tablegenerator.TableGenerator;
import reversestring.ReverseString;
import arraysort.ArraySort;
import arraytranspose.ArrayTranspose;
import letterfrequency.LetterFrequency;
import agecalculator.AgeCalculator;
import slideexamples.BufferedFileInput;
import slideexamples.BufferedInput;
import slideexamples.ByteArrayIO;
import slideexamples.ByteInputStream;
import slideexamples.ByteOutputStream;
import slideexamples.FileCopy;
import slideexamples.FileCreateReadOnly;
import slideexamples.DataIOStream;
import slideexamples.FileDemo;
import slideexamples.FileInfo;
import slideexamples.FileOutputDemo;
import slideexamples.FileReadDisplay;
import slideexamples.RandomAccessFileDemo;
import slideexamples.SimpleInputOutput;
import slideexamples.WithBufferedStream;
import slideexamples.WithoutBufferedStream;
import slideexamples.ZipFileDemo;



public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Running all Questions:");

        // SlideExamples
        
        String readFile = "files/ReadFile.txt";
        String inputFile = "files/InputFile.txt";
        String outputFile = "files/OutputFile.txt";
        String newFile = "files/NewFile.txt";
        String processDataFile = "files/ProcessDataFile.txt";
        String fileOutputDemo = "files/FileOutputDemo.txt";
        String randomFile = "files/RandomFile.txt";
        String inputBuffer = "files/InputBuffer.png";
        String outputBuffer = "files/OutputBuffer.jpeg";
        String zipFile = "files/ZipReadFile.zip";
        String zipEntry = "ZipReadFile.txt";
      
        System.out.println("\nSlide Examples:");
        System.out.println("Program 1: Read File");
        BufferedFileInput.readFile(readFile);
        System.out.println("\nProgram 2: Read Console");
        BufferedInput.readConsole();
        System.out.println("\nProgram 3: Byte Array IO");
        ByteArrayIO.processByteArray();
        System.out.println("\nProgram 4: Byte Input Stream");
        ByteInputStream.demonstrateByteInput();
        System.out.println("\nProgram 5: Byte Output Stream");
        ByteOutputStream.demonstrateByteOutput();
        System.out.println("\nProgram 6: File Copy");
        FileCopy.copyFile(inputFile,outputFile);
        System.out.println("\nProgram 7: File Create ReadOnly");
        FileCreateReadOnly.createReadOnlyFile(newFile);
        System.out.println("\nProgram 8: Data IO Stream");
        DataIOStream.processDataIO(processDataFile);
        System.out.println(processDataFile);
        System.out.println("\nProgram 9: File Demo");
        FileDemo.readFile(readFile);
        System.out.println("\nProgram 10: File Info");
        FileInfo.printFileInfo(readFile);
        System.out.println("\nProgram 11: File Output Demo");
        FileOutputDemo.writeFileOutput(fileOutputDemo);
        System.out.println("\nProgram 12: File Read Display");
        FileReadDisplay.displayFileContents(inputFile);
        System.out.println("\nProgram 13: Random Access File Demo");
        RandomAccessFileDemo.saveAndReadFile(randomFile);
        System.out.println("\nProgram 14: Simple Input Output");
        SimpleInputOutput.readAndDisplayInput();
        System.out.println("\nProgram 15: Copy With Buffered Stream");
        WithBufferedStream.copyWithBufferStream(inputBuffer,outputBuffer);
        System.out.println("\nProgram 16: Copy Without Buffered Stream");
        WithoutBufferedStream.copyWithoutBufferStream(inputBuffer,outputBuffer);
        System.out.println("\nProgram 17: Zip File Demo");
        ZipFileDemo.processZipFile(zipFile,zipEntry);
        
        

        // TableGenerator
        System.out.println("\nQuestion 2: Table Generator");
        TableGenerator.printTable();

        // ArraySort
        System.out.println("\nQuestion 3: Array Sort");
         int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Original Array: ");
        ArraySort.printArray(arr);

        int min = ArraySort.findSmallest(arr);
        int max = ArraySort.findLargest(arr);
        System.out.println("\nSmallest Number: " + min);
        System.out.println("Largest Number: " + max);

        int[] ascendingArr = ArraySort.sortAscending(arr.clone());
        System.out.println("Array in Ascending Order: ");
        ArraySort.printArray(ascendingArr);

        int[] descendingArr = ArraySort.sortDescending(arr.clone());
        System.out.println("\nArray in Descending Order: ");
        ArraySort.printArray(descendingArr);
       

        // ArrayTranspose
        System.out.println("\nQuestion 4: Array Transpose");
        int[][] array = { 
        { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, 
        { 9, 10, 11, 12 },{ 13, 14, 15, 16 }, 
        { 17, 18, 19, 20 }};
        System.out.println("Original Array: ");
        ArrayTranspose.printArray(array);

        int[][] transposed = ArrayTranspose.transpose(array);
        System.out.println("\nTransposed Array: ");
        ArrayTranspose.printArray(transposed);

        // ReverseString
        System.out.println("\nQuestion 5: String Reverse using Loops and Recursion");
        System.out.println("Reversing String using Recursion: " + ReverseString.reverseStringR("Muhammad Bilal"));
        System.out.println("Reversing String using Loops: " + ReverseString.reverseStringL("Muhammad Bilal"));
        

        // LetterFrequency
        System.out.println("\nQuestion 6: Letter Frequency Count");
        LetterFrequency.countLetters("Muhammad Bilal"); 

        // AgeCalculator
        System.out.println("\nQuestion 7: Age Calculator");
        AgeCalculator.calculateAge("2002-09-17"); 
    }
}
