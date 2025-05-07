import java.util.ArrayList;
import java.util.Scanner;

public class Currency_Converter {

 public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);

  float amt=0.0f;
  boolean flag=true;
  while (flag) {
    System.out.println("Enter Ammount :");
    amt=sc.nextInt();
    if(amt<0)
       System.out.println("Ammount does not negative, enter correct ammount!");
    else
      flag=false;

  }

  ArrayList<String> fromList = new ArrayList<>();
  fromList.add("INR - Indian Rupee");
  fromList.add("AUD - Australian Dollar");
  fromList.add("BDT - Banfladeshi Taka");
  fromList.add("BCH - Bitcoin Cash");
  fromList.add("CAD - Canadian Dollar");
  fromList.add("USD - US Dollar");
  fromList.add("JPY - Japanese yen");
  fromList.add("CHF - Swiss franc");
  fromList.add("CNH - Chinese renminbi");
  fromList.add("HKD - Hong Kong dollar");
  fromList.add("NZD - New Zealand dollar");

  for(String str:fromList)
    System.out.println(str);

  System.out.println("Select From :");
  String from=sc.next();
  from = from.toUpperCase();



  if(from.equals("INR - Indian Rupee") || from.equals("INR")){

   ArrayList<String> toList = new ArrayList<>();
   toList.add("AUD - Australian Dollar");
   toList.add("BDT - Banfladeshi Taka");
   toList.add("BCH - Bitcoin Cash");
   toList.add("CAD - Canadian Dollar");
   toList.add("USD - US Dollar");
   toList.add("JPY - Japanese yen");
   toList.add("CHF - Swiss franc");
   toList.add("CNH - Chinese renminbi");
   toList.add("HKD - Hong Kong dollar");
   toList.add("NZD - New Zealand dollar");

   for(String str: toList)
     System.out.println(str);

   System.out.println("Select To :");
   String to=sc.next();
   to = to.toUpperCase();

   if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
    double ans =amt*0.018341325;
    System.out.println(amt+" INR = "+ans +" AUD");
   }
   
   else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
    double ans  = amt*1.4398609;
    System.out.println(amt+" INR = "+ans +" BDT");
   }
   else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
    double ans  = amt*0.000032921681177;
    System.out.println(amt+" INR = "+ans +" BCH");
   }
   else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
    double ans  = amt*0.016365702;
    System.out.println(amt+" INR = "+ans +" CAD");
   }
   else if(to.equals("USD - US Dollar") || to.equals("USD")){
    double ans = amt*0.011842903;
    System.out.println(amt+" INR = "+ans +" USD");
   }
   else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
    double ans  = amt*1.6946939;
    System.out.println(amt+" INR = "+ans +" JPY");
   }
   else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
    double ans  = amt*0.0097582546;
    System.out.println(amt+" INR = "+ans +" CHF");
   }
   else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
    double ans = amt*0.085451307;
    System.out.println(amt+" INR = "+ans +" CNH");
   }
   else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
    double ans  = amt*0.091787983;
    System.out.println(amt+" INR = "+ans +" HKD");
   }
   else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
    double ans = amt*0.019809906;
    System.out.println(amt+" INR = "+ans+" NZD");
   }

  }

  else if(from.equals("AUD - Australian Dollar") || from.equals("AUD")){

   ArrayList<String> toList = new ArrayList<>();
   fromList.add("INR - Indian Rupee");
   fromList.add("BDT - Banfladeshi Taka");
   fromList.add("BCH - Bitcoin Cash");
   fromList.add("CAD - Canadian Dollar");
   fromList.add("USD - US Dollar");
   fromList.add("JPY - Japanese yen");
   fromList.add("CHF - Swiss franc");
   fromList.add("CNH - Chinese renminbi");
   fromList.add("HKD - Hong Kong dollar");
   fromList.add("NZD - New Zealand dollar");
 
    for(String str: toList)
      System.out.println(str);
 
    System.out.println("Select To :");
    String to=sc.next();
    to = to.toUpperCase();
 
    if(to.equals("INR - Indian Rupee") || to.equals("INR")){
     double ans =amt*54.462768;
     System.out.println(amt+" AUD = "+ans +" INR");
    }
    else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
     double ans   = amt*78.438004;
     System.out.println(amt+"AUD = "+ans +" BDT");
    }
    else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
     double ans  = amt*0.001790426358416;
     System.out.println(amt+"AUD = "+ans +" BCH");
    }
    else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
     double ans  = amt*0.89;
     System.out.println(amt+" AUD = "+ans +" CAD");
    }
    else if(to.equals("USD - US Dollar") || to.equals("USD")){
     double ans  = amt*0.64488434;
     System.out.println(amt+" AUD = "+ans +" USD");
    }
    else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
     double ans  = amt*92.28821;
     System.out.println(amt+" AUD = "+ans +" JPY");
    }
    else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
     double ans  = amt*0.53102296;
     System.out.println(amt+" AUD = "+ans +" CHF");
    }
    else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
     double ans = amt*4.6511974;
     System.out.println(amt+" AUD = "+ans +" CNH");
    }
    else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
     double ans  = amt*4.996069;
     System.out.println(amt+" AUD = "+ans +" HKD");
    }
    else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
     double ans  = amt*1.0789633;
     System.out.println(amt+" AUD = "+ans +" NZD");
    }
 
   }

   else if(from.equals("BDT - Banfladeshi Taka") || from.equals("BDT")){

   ArrayList<String> toList = new ArrayList<>();
   fromList.add("INR - Indian Rupee");
   fromList.add("AUD - Australian Dollar");
   fromList.add("BCH - Bitcoin Cash");
   fromList.add("CAD - Canadian Dollar");
   fromList.add("USD - US Dollar");
   fromList.add("JPY - Japanese yen");
   fromList.add("CHF - Swiss franc");
   fromList.add("CNH - Chinese renminbi");
   fromList.add("HKD - Hong Kong dollar");
   fromList.add("NZD - New Zealand dollar");
  
     for(String str: toList)
       System.out.println(str);
  
     System.out.println("Select To :");
     String to=sc.next();
     to = to.toUpperCase();
  
     if(to.equals("INR - Indian Rupee") || to.equals("INR")){
      double ans=amt*.69431368;
      System.out.println(amt+" BDT = "+ans+" INR");
     }
     else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
      double ans = amt*.012760604;
      System.out.println(amt+" BDT = "+ans+" AUD");
     }
     else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
      double bdt = amt*.000022893996732;
      System.out.println(amt+" BDT = "+bdt+" BCH");
     }
     else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
      double bdt = amt*.011367065;
      System.out.println(amt+" BDT = "+bdt+" CAD");
     }
     else if(to.equals("USD - US Dollar") || to.equals("USD")){
      double bdt = amt*0.011367065;
      System.out.println(amt+" BDT = "+bdt+" USD");
     }
     else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
      double bdt = amt*1.176395;
      System.out.println(amt+" BDT = "+bdt+" JPY");
     }
     else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
      double bdt = amt*0.0067750254;
      System.out.println(amt+" BDT = "+bdt+" CHF");
     }
     else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
      double bdt = amt*0.059329897;
      System.out.println(amt+"BDT = "+bdt+" CNH");
     }
     else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
      double bdt = amt*0.063726841;
      System.out.println(amt+" BDT = "+bdt+" HKD");
     }
     else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
      double bdt = amt*0.013762524;
      System.out.println(amt+" BDT = "+bdt+" NZD");
     }
  
    }

    else if(from.equals("BCH - Bitcoin Cash") || from.equals("BCH")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("CAD - Canadian Dollar");
      fromList.add("USD - US Dollar");
      fromList.add("JPY - Japanese yen");
      fromList.add("CHF - Swiss franc");
      fromList.add("CNH - Chinese renminbi");
      fromList.add("HKD - Hong Kong dollar");
      fromList.add("NZD - New Zealand dollar");
     
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*30316.388;
         System.out.println(amt+" BCH = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*557.21088;
         System.out.println(amt+" BCH = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*43758.689;
         System.out.println(amt+" BCH = "+bdt+" BDT");
        }
        else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
         double bdt = amt*497.61755;
         System.out.println(amt+" BCH = "+bdt+" CAD");
        }
        else if(to.equals("USD - US Dollar") || to.equals("USD")){
         double bdt = amt*360.12571;
         System.out.println(amt+" BCH = "+bdt+" USD");
        }
        else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
         double bdt = amt*51583.421;
         System.out.println(amt+" BCH = "+bdt+" JPY");
        }
        else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
         double bdt = amt*297.54625;
         System.out.println(amt+" BCH = "+bdt+" CHF");
        }
        else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
         double bdt = amt*2603.814;
         System.out.println(amt+" BCH = "+bdt+" CNH");
        }
        else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
         double bdt = amt*2797.0643;
         System.out.println(amt+"BCD = "+bdt+" HKD");
        }
        else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
         double bdt = amt*604.46032;
         System.out.println(amt+" BCH = "+bdt+" NZD");
        }
     
    }

    else if(from.equals("CAD - Canadian Dollar") || from.equals("CAD")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("BCH - Bitcoin Cash");
      fromList.add("USD - US Dollar");
      fromList.add("JPY - Japanese yen");
      fromList.add("CHF - Swiss franc");
      fromList.add("CNH - Chinese renminbi");
      fromList.add("HKD - Hong Kong dollar");
      fromList.add("NZD - New Zealand dollar");
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*61.073991;
         System.out.println(amt+" CAD = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*1.1223722;
         System.out.println(amt+" CAD = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*87.936531;
         System.out.println(amt+" CAD = "+bdt+" BDT");
        }
        else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
         double bdt = amt*0.002004496165413;
         System.out.println(amt+" CAD = "+bdt+" BCH");
        }
        else if(to.equals("USD - US Dollar") || to.equals("USD")){
         double bdt = amt*0.72322831;
         System.out.println(amt+" CAD = "+bdt+" USD");
        }
        else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
         double bdt = amt*103.55811;
         System.out.println(amt+" CAD = "+bdt+" JPY");
        }
        else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
         double bdt = amt*0.59659391;
         System.out.println(amt+" CAD = "+bdt+" CHF");
        }
        else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
         double bdt = amt*5.2180599;
         System.out.println(amt+" CAD = "+bdt+" CNH");
        }
        else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
         double bdt = amt*5.6052278;
         System.out.println(amt+" CAD = "+bdt+" HKD");
        }
        else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
         double bdt = amt*1.2112672;
         System.out.println(amt+" CAD = "+bdt+" NZD");
        }
     
    }

    else if(from.equals("USD - US Dollar") || from.equals("USD")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("BCH - Bitcoin Cash");
      fromList.add("CAD - Canadian Dollar");
      fromList.add("JPY - Japanese yen");
      fromList.add("CHF - Swiss franc");
      fromList.add("CNH - Chinese renminbi");
      fromList.add("HKD - Hong Kong dollar");
      fromList.add("NZD - New Zealand dollar");
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*84.438272;
         System.out.println(amt+" USD = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*1.551514;
         System.out.println(amt+" USD = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*121.64168;
         System.out.println(amt+" USD = "+bdt+" BDT");
        }
        else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
         double bdt = amt*.0027770484;
         System.out.println(amt+" USD = "+bdt+" BCH");
        }
        else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
         double bdt = amt*1.3825572;
         System.out.println(amt+" USD = "+bdt+" CAD");
        }
        else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
         double bdt = amt*143.14247;
         System.out.println(amt+" USD = "+bdt+" JPY");
        }
        else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
         double bdt = amt*.82477663;
         System.out.println(amt+" USD = "+bdt+" CHF");
        }
        else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
         double bdt = amt*7.2149615;
         System.out.println(amt+" USD = "+bdt+" CNH");
        }
        else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
         double bdt = amt*7.7502587;
         System.out.println(amt+" USD = "+bdt+" HKD");
        }
        else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
         double bdt = amt*1.6747274;
         System.out.println(amt+" USD = "+bdt+" NZD");
        }
     
    }

    else if(from.equals("JPY - Japanese yen") || from.equals("JPY")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("BCH - Bitcoin Cash");
      fromList.add("CAD - Canadian Dollar");
      fromList.add("USD - US Dollar");
      fromList.add("CHF - Swiss franc");
      fromList.add("CNH - Chinese renminbi");
      fromList.add("HKD - Hong Kong dollar");
      fromList.add("NZD - New Zealand dollar");
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*.58981919;
         System.out.println(amt+" JPY = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*0.010837085;
         System.out.println(amt+" JPY = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*.84945461;
         System.out.println(amt+" JPY = "+bdt+" BDT");
        }
        else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
         double bdt = amt*0.000019424163035;
         System.out.println(amt+" JPY = "+bdt+" BCH");
        }
        else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
         double bdt = amt*.0096556879;
         System.out.println(amt+" JPY = "+bdt+" CAD");
        }
        else if(to.equals("USD - US Dollar") || to.equals("USD")){
         double bdt = amt*.0069837476;
         System.out.println(amt+" JPY = "+bdt+" USD");
        }
        else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
         double bdt = amt*.0057642005;
         System.out.println(amt+" JPY = "+bdt+" CHF");
        }
        else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
         double bdt = amt*0.05039058;
         System.out.println(amt+" JPY = "+bdt+" CNH");
        }
        else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
         double bdt = amt*0.054122422;
         System.out.println(amt+" JPY = "+bdt+" HKD");
        }
        else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
         double bdt = amt*.011699432;
         System.out.println(amt+" JPY = "+bdt+" NZD");
        }
     
    }

    else if(from.equals("CHF - Swiss franc") || from.equals("CHF")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("BCH - Bitcoin Cash");
      fromList.add("CAD - Canadian Dollar");
      fromList.add("USD - US Dollar");
      fromList.add("JPY - Japanese yen");
      fromList.add("CNH - Chinese renminbi");
      fromList.add("HKD - Hong Kong dollar");
      fromList.add("NZD - New Zealand dollar");
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*102.28944;
         System.out.println(amt+" CHF = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*1.8795373;
         System.out.println(amt+" CHF = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*147.27077;
         System.out.println(amt+" CHF = "+bdt+" BDT");
        }
        else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
         double bdt = amt*0.003367345629993;
         System.out.println(amt+" CHF = "+bdt+" BCH");
        }
        else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
         double bdt = amt*1.6740118;
         System.out.println(amt+" CHF = "+bdt+" CAD");
        }
        else if(to.equals("USD - US Dollar") || to.equals("USD")){
         double bdt = amt*1.2101613;
         System.out.println(amt+" CHF = "+bdt+" USD");
        }
        else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
         double bdt = amt*173.42851;
         System.out.println(amt+" CHF = "+bdt+" JPY");
        }
        else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
         double bdt = amt*8.731385;
         System.out.println(amt+" CHF = "+bdt+" CNH");
        }
        else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
         double bdt = amt*9.3786025;
         System.out.println(amt+" CHF = "+bdt+" HKD");
        }
        else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
         double bdt = amt*2.0283219;
         System.out.println(amt+" CHF = "+bdt+" NZD");
        }
     
    }

    else if(from.equals("CNH - Chinese renminbi") || from.equals("CNH")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("BCH - Bitcoin Cash");
      fromList.add("CAD - Canadian Dollar");
      fromList.add("USD - US Dollar");
      fromList.add("JPY - Japanese yen");
      fromList.add("CHF - Swiss franc");
      fromList.add("HKD - Hong Kong dollar");
      fromList.add("NZD - New Zealand dollar");
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*11.705501;
         System.out.println(amt+" CNH = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*0.21503485;
         System.out.println(amt+" CNH = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*16.858885;
         System.out.println(amt+" CNH = "+bdt+" BDT");
        }
        else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
         double bdt = amt*0.000385045692217;
         System.out.println(amt+" CNH = "+bdt+" BCH");
        }
        else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
         double bdt = amt*0.19166368;
         System.out.println(amt+" CNH = "+bdt+" CAD");
        }
        else if(to.equals("USD - US Dollar") || to.equals("USD")){
         double bdt = amt*0.13857506;
         System.out.println(amt+" CNH = "+bdt+" USD");
        }
        else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
         double bdt = amt*19.862217;
         System.out.println(amt+" CNH = "+bdt+" JPY");
        }
        else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
         double bdt = amt*0.11449521;
         System.out.println(amt+" CNH = "+bdt+" CHF");
        }
        else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
         double bdt = amt*1.0741298;
         System.out.println(amt+" CNH = "+bdt+" HKD");
        }
        else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
         double bdt = amt*0.23221037;
         System.out.println(amt+" CNH = "+bdt+" NZD");
        }
     
    }

    else if(from.equals("HKD - Hong Kong dollar") || from.equals("HKD")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("BCH - Bitcoin Cash");
      fromList.add("CAD - Canadian Dollar");
      fromList.add("USD - US Dollar");
      fromList.add("JPY - Japanese yen");
      fromList.add("CHF - Swiss franc");
      fromList.add("CNH - Chinese renminbi");
      fromList.add("NZD - New Zealand dollar");
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*10.892484 ;
         System.out.println(amt+" HKD = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*0.20013004 ;
         System.out.println(amt+" HKD = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*15.694166;
         System.out.println(amt+" HKD = "+bdt+" BDT");
        }
        else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
         double bdt = amt*0.000358758294253;
         System.out.println(amt+" HKD = "+bdt+" BCH");
        }
        else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
         double bdt = amt*0.17838726;
         System.out.println(amt+" HKD = "+bdt+" CAD");
        }
        else if(to.equals("USD - US Dollar") || to.equals("USD")){
         double bdt = amt*0.12902863;
         System.out.println(amt+" HKD = "+bdt+" USD");
        }
        else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
         double bdt = amt*18.484168;
         System.out.println(amt+" HKD = "+bdt+" JPY");
        }
        else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
         double bdt = amt*0.10656826;
         System.out.println(amt+" HKD = "+bdt+" CHF");
        }
        else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
         double bdt = amt*0.9309034;
         System.out.println(amt+" HKD = "+bdt+" CNH");
        }
        else if(to.equals("NZD - New Zealand dollar") || to.equals("NZD")){
         double bdt = amt*0.216086;
         System.out.println(amt+" HKD = "+bdt+" NZD");
        }
     
    }

    else if(from.equals("NZD - New Zealand dollar") || from.equals("NZD")){

      ArrayList<String> toList = new ArrayList<>();
      fromList.add("INR - Indian Rupee");
      fromList.add("AUD - Australian Dollar");
      fromList.add("BDT - Banfladeshi Taka");
      fromList.add("BCH - Bitcoin Cash");
      fromList.add("CAD - Canadian Dollar");
      fromList.add("USD - US Dollar");
      fromList.add("JPY - Japanese yen");
      fromList.add("CHF - Swiss franc");
      fromList.add("CNH - Chinese renminbi");
      fromList.add("HKD - Hong Kong dollar");
        for(String str: toList)
          System.out.println(str);
     
        System.out.println("Select To :");
        String to=sc.next();
        to = to.toUpperCase();
     
        if(to.equals("INR - Indian Rupee") || to.equals("INR")){
         double aud=amt*50.400604;
         System.out.println(amt+" NZD = "+aud+" INR");
        }
        else if(to.equals("AUD - Australian Dollar") || to.equals("AUD")){
         double bdt = amt*0.92620226;
         System.out.println(amt+" NZD = "+bdt+" AUD");
        }
        else if(to.equals("BDT - Banfladeshi Taka") || to.equals("BDT")){
         double bdt = amt*72.624772;
         System.out.println(amt+" NZD = "+bdt+" BDT");
        }
        else if(to.equals("BCH - Bitcoin Cash") || to.equals("BCH")){
         double bdt = amt*0.001661306088991;
         System.out.println(amt+" NZD = "+bdt+" BCH");
        }
        else if(to.equals("CAD - Canadian Dollar") || to.equals("CAD")){
         double bdt = amt*0.82550128;
         System.out.println(amt+" NZD = "+bdt+" CAD");
        }
        else if(to.equals("USD - US Dollar") || to.equals("USD")){
         double bdt = amt*0.59716736;
         System.out.println(amt+" NZD = "+bdt+" USD");
        }
        else if(to.equals("JPY - Japanese yen") || to.equals("JPY")){
         double bdt = amt*85.547996;
         System.out.println(amt+" NZD = "+bdt+" JPY");
        }
        else if(to.equals("CHF - Swiss franc") || to.equals("CHF")){
         double bdt = amt*0.49306613;
         System.out.println(amt+" NZD = "+bdt+" CHF");
        }
        else if(to.equals("CNH - Chinese renminbi") || to.equals("CNH")){
         double bdt = amt*4.3074691;
         System.out.println(amt+" NZD = "+bdt+" CNH");
        }
        else if(to.equals("HKD - Hong Kong dollar") || to.equals("HKD")){
         double bdt = amt*4.6275756;
         System.out.println(amt+" NZD = "+bdt+" HKD");
        }
     
    }

  sc.close();
  

 }
}