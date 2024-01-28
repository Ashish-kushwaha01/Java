package collegeActivity;

import java.util.Scanner;

     public static void show (){
        for(int l=1;l<=1;l++){
            System.out.print("Sun\s");
            System.out.print("Mun\s");
            System.out.print("Tue\s");
            System.out.print("Wed\s");
            System.out.print("Thur\s");
            System.out.print("Fri\s");
            System.out.print("Sat\s");
           }
    }





public class Calender {
    public static void main(String[] args) {
        int year;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your year : ");
        year = in.nextInt();
        int month[] = new int [12];
        
       
        month[0]=31;
     if(year%4!=0)
     month[1] = 28;
     else 
     month[1]= 29;
       month[2]=31;
       month[3]=30;
       month[4]=31;
       month[5]=30;
       month[6]=31;
       month[7]=31;
       month[8]=30;
       month[9]=31;
       month[10]=30;
       month[11]=31;
       

      for(int i=0;i<12;i++){
        
       if(i==0){
        System.out.println("January has "+month[i]+ " days.");
        for(int l=1;l<=1;l++){
            System.out.print("Sun\s");
            System.out.print("Mun\s");
            System.out.print("Tue\s");
            System.out.print("Wed\s");
            System.out.print("Thur\s");
            System.out.print("Fri\s");
            System.out.print("Sat\s");
           }
       System.out.println("");
        for(int j=0;j<5;j++){
            for(int k= (7*j)+1;k<=7*(j+1);k++){
               
        
      
                   if((k)<=month[i]){
                    System.out.print(k + "\s");
                    continue;
                   }
                   else{
                    System.out.print("");
                   }
                
                }
                System.out.print("\n");
        
            }
        
       }
        else if  (i==1){  
              System.out.println("\n");
            System.out.println("February has "+month[i]+ " days.");
        ref.show();
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==2){System.out.println("\n");
            System.out.println("March has "+month[i]+ " days.");
            
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==3){ 
            System.out.println("\n");
            System.out.println("April has "+month[i]+ " days.");
           
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==4){
            System.out.println("\n");
            System.out.println("May has "+month[i]+ " days.");
            
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==5){
            System.out.println("\n");
            System.out.println("June has "+month[i]+ " days.");
            
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==6){
            System.out.println("\n");
            System.out.println("July has "+month[i]+ " days.");
            
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==7){ 
            System.out.println("\n");
            System.out.println("August has "+month[i]+ " days.");
           
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==8){
            System.out.println("\n");
            System.out.println("September has "+month[i]+ " days.");
            
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==9){ 
            System.out.println("\n");
            System.out.println("October has "+month[i]+ " days.");
           
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==10){ 
             System.out.println("\n");
           System.out.println("November has "+month[i]+ " days.");
         
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
            
        } else if  (i==11){ 
            System.out.println("\n");
            System.out.println("December  has "+month[i]+ " days.");
           
            for(int j=0;j<5;j++){
                for(int k= (7*j)+1;k<=7*(j+1);k++){
                   
            
          
                       if((k)<=month[i]){
                        System.out.print(k + "\s");
                        continue;
                       }
                       else{
                        System.out.print("");
                       }
                    
                    }
                    System.out.print("\n");
            
                }
        
        }
        
      }
    }
    
}

