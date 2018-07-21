import java.util.Scanner;
public class BinaryCalculator 
{ 

 public static void main(String[] args) {
 
 System.out.println("Enter Two Binary Numbers");
 Scanner keyboard = new Scanner(System.in);
 // now to capture the bin numbers out of the input  
  String firstBinaryNumber = keyboard.next();
  String secondBinaryNumber = keyboard.next();
 //Capture individual characters from binary  
 /*first letter is reference to which original binary it comes from 
 *the number is reference to which indices the number is from
 */
  char binaryA0 = firstBinaryNumber.charAt(0);
  char binaryA1 = firstBinaryNumber.charAt(1);
  char binaryA2 = firstBinaryNumber.charAt(2);
  char binaryA3 = firstBinaryNumber.charAt(3);
  char binaryB0 = secondBinaryNumber.charAt(0);
  char binaryB1 = secondBinaryNumber.charAt(1);
  char binaryB2 = secondBinaryNumber.charAt(2);
  char binaryB3 = secondBinaryNumber.charAt(3);
 //now to convert each to an integer to perform the indicated operation
  int decimalA0 = Character.getNumericValue(binaryA0);
  int decimalA1 = Character.getNumericValue(binaryA1);
  int decimalA2 = Character.getNumericValue(binaryA2);
  int decimalA3 = Character.getNumericValue(binaryA3);
  int decimalB5 = Character.getNumericValue(binaryB0);
  int decimalB6 = Character.getNumericValue(binaryB1);
  int decimalB7 = Character.getNumericValue(binaryB2);
  int decimalB8 = Character.getNumericValue(binaryB3);
 //now to convert to decimal value using a longer method without powers
  int value1 = decimalA0*2+decimalA1;
  int value2 = value1*2+decimalA2;
  int value3 = value2*2+decimalA3;
  int firstDecimalNumber = value3;
  int value4 = decimalB5*2+decimalB6;
  int value5 = value4*2+decimalB7;
  int value6= value5*2+decimalB8;
  int secondDecimalNumber = value6;
 //now to perform the actual math of adding decimal values of inputed binary digits
  int total = firstDecimalNumber + secondDecimalNumber;
   
 //now to convert total back to binary
  int base = 2;
  int result = 0;
  int multiplier = 1;
  
  while (total>0)
  {
   int residue = total%base;
   total = total/base;
   result = result +residue*multiplier;
   multiplier = multiplier * 10;
  }
 //output final 
  System.out.println("The first decimal is " + firstDecimalNumber +", the second decimal number is " + secondDecimalNumber + ", and the resulting binary number is " + result);
 }
}