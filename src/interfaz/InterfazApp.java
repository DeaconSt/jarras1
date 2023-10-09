package interfaz; 

import mundo.Jarras;

public class InterfazApp 
{
    // 11-03-2022
    public static void main(String[] args) 
    { Jarras jarras;
       
   // TEST 1 
      System.out.println("TEST 1");
      jarras = new Jarras();
      System.out.println("subtest 0: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
   // test 1
      jarras.llenar8();
      jarras.llenar6();      
      System.out.println("subtest 1: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
   // test 2
      jarras.vaciar68();
      jarras.vaciar86();      
      System.out.println("subtest 2: " + jarras.getJarras6() + " " + jarras.getJarras8());

   // test 3
      jarras.vaciar8();
      jarras.vaciar68();
      System.out.println("subtest 3: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
   // test 4
      jarras.llenar8();
      jarras.vaciar86();
      System.out.println("subtest 4: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
   // test 5
      jarras.vaciar8();
      jarras.vaciar6();
      jarras.llenar8();
      jarras.vaciar86();
      System.out.println("subtest 5: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
      jarras.setJarras8(4);
      jarras.setJarras6(5);
      jarras.llenar86();
      System.out.println("subtest 6: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
      jarras.setJarras8(4);
      jarras.setJarras6(2);
      jarras.llenar68();
      System.out.println("subtest 7: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
      jarras.vaciar86();
      System.out.println("subtest 8: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
      jarras.vaciar68();
      System.out.println("subtest 9: " + jarras.getJarras6() + " " + jarras.getJarras8());

      jarras.setJarras8(8);
      jarras.setJarras6(4);
      jarras.llenar68();
      System.out.println("subtest A: " + jarras.getJarras6() + " " + jarras.getJarras8());
      
      jarras.setJarras8(7);
      jarras.setJarras6(2);
      jarras.llenar86();
      System.out.println("subtest B: " + jarras.getJarras6() + " " + jarras.getJarras8());
      


//    TEST 2
    System.out.println("TEST 2");
     jarras = new Jarras(5, 3);
    System.out.println("subtest 0: " + jarras.getJarras6() + " " + jarras.getJarras8());
//
     jarras.llenar68();
    System.out.println("subtest 1: " + jarras.getJarras6() + " " + jarras.getJarras8());
     jarras.vaciar6(); 
     System.out.println("subtest 2: " + jarras.getJarras6() + " " + jarras.getJarras8());
     jarras.vaciar86();
     System.out.println("subtest 3: " + jarras.getJarras6() + " " + jarras.getJarras8());
     jarras.llenar8();
     System.out.println("subtest 4: " + jarras.getJarras6() + " " + jarras.getJarras8());
    jarras.llenar68();
   System.out.println("subtest 5: " + jarras.getJarras6() + " " + jarras.getJarras8());
     jarras.vaciar6();
    System.out.println("subtest 6: " + jarras.getJarras6() + " " + jarras.getJarras8());
    } 
}
