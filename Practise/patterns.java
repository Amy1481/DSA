public class patterns {
    public static void main(String[] args) {
    //Pattern 1 
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            System.out.print("* ");
        }
        System.out.println();
      }

    // Pattern 2
    for(int i=0;i<=5;i++){
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
      }
    // Pattern 3
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
          System.out.print(j+" ");
      }
      System.out.println();
    }

    // Pattern 4
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
          System.out.print(i+" ");
      }
      System.out.println();
    } 

     // Pattern 5
     for(int i=1;i<=5;i++){
      for(int j=0;j<5-i+1;j++){
          System.out.print("* ");
      }
      System.out.println();
    } 

    // Pattern 6
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5-i+1;j++){
          System.out.print(j+" ");
      }
      System.out.println();
    } 

    // Pattern 7
    for(int i=0;i<5;i++){
      // for space
      for(int j=0;j<5-i-1;j++){
          System.out.print(" ");
      }
      // for star
      for (int j=0;j<(2*i+1);j++) {
          System.out.print("*");
      }
       // for space
       for(int j=0;j<5-i-1;j++){
        System.out.print(" ");
    }
      System.out.println();
    } 

    // Pattern 8
    for(int i=0;i<5;i++){
      // for space
      for(int j=0;j<i;j++){
          System.out.print(" ");
      }
      // for star
      for (int j=0;j<(10-(2*i+1));j++) {
          System.out.print("*");
      }
       // for space
       for(int j=0;j<i;j++){
        System.out.print(" ");
    }
      System.out.println();
    } 

    // Pattern 9
    int n=5;
     // For upper half
    for(int i=0;i<n;i++){
      // for space
      for(int j=0;j<n-i-1;j++){
          System.out.print(" ");
      }
      // for star
      for (int j=0;j<(2*i+1);j++) {
          System.out.print("*");
      }
      System.out.println();
    }
    // For lower half
    for(int i=n-2;i>=0;i--){
       for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
      }
      for(int j=0;j<2*i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    } 

    // Pattern 10
   for(int i=1;i<=2*n-1;i++){
    int stars = i;
    if(i > n){
      stars = 2*n-i;
    }
    for(int j=1;j<=stars;j++){
      System.out.print("*");
    }
    System.out.println();
   }

  //  Pattern 11
   for(int i=0;i<n;i++){
    int start;
    if(i%2 == 0){
     start = 0;
    }
    else{
      start = 1;
    }
    for(int j=0;j<=i;j++){
      System.out.print(start);
      start = 1-start;
    }
    System.out.println();
   }

  //  Pattern 12
  int space=2*(n-1);
   for(int i=1;i<=n;i++){
   //Numbers
   for(int j=1;j<=i;j++){
    System.out.print(j);
   }
   //Space
   for(int j=1;j<=space;j++){
    System.out.print(" ");
   }
   //Numbers
   for(int j=i;j>=1;j--){
    System.out.print(j);
   }
   System.out.println();
   space -= 2;
   }

   //Pattern 13
   int num=1;
   for(int i=1;i<=n;i++){
     for(int j=1;j<=i;j++){
      System.out.print(num + " ");
      num = num+1;
     }
     System.out.println();
   }

  //Pattern 14
  for(int i=0;i<n;i++){
    for(char ch = 'A';ch <= 'A' + i;ch++){
      System.out.print(ch + " ");
    }
    System.out.println();
  }

  //Pattern 15
  for(int i=0;i<n;i++){
    for(char ch='A';ch<='A'+(n-i-1);ch++ ){
      System.out.print(ch + " ");
    }
    System.out.println();
  }

  //Pattern 16
  for(int i=0;i<n;i++){
    char ch= (char)('A' + i); 
    for(int j=0;j<=i;j++){
      System.out.print(ch+" ");
    }
    System.out.println();
  }

  //Pattern 17
  for(int i=0;i<5;i++){
    // for space
    for(int j=0;j<5-i-1;j++){
        System.out.print(" ");
    }
    // for characters
    char ch=(char)('A');
    int breakpoint = (2*i+1) / 2;
    for(int j=0;j<2*i+1;j++){
      System.out.print(ch);
      if(j < breakpoint){
        ch++;
      }
      else{
        ch--;
      }
    }
     // for space
     for(int j=0;j<5-i-1;j++){
      System.out.print(" ");
  }
    System.out.println();
  }

  //Pattern 18
  for(int i=0;i<n;i++){
    for(char ch = (char)('E'-i); ch <= 'E'; ch++){
      System.out.print(ch+" ");
    }
    System.out.println();
  }

  //Pattern 19
  int iniS=0;
  for(int i=0;i<n;i++){
   //stars
   for(int j=1;j<=n-i;j++){
    System.out.print("*");
   }
   //space
   for(int j=0;j<iniS;j++){
    System.out.print(" ");
   }
   //stars 
   for(int j=1;j<=n-i;j++){
    System.out.print("*");
   }
   iniS += 2;
   System.out.println();
  }
  iniS=2*n-2;
  for(int i=1;i<=n;i++){
    //stars
   for(int j=1;j<=i;j++){
    System.out.print("*");
   }
   //space
   for(int j=0;j<iniS;j++){
    System.out.print(" ");
   }
   //stars 
   for(int j=1;j<=i;j++){
    System.out.print("*");
   }
   iniS -= 2;
   System.out.println();
  }

  //Pattern 20
  int spaces = 2*n-2;
  for(int i=1;i<=2*n-1;i++){
    int stars = i;
    if (i>n){
      stars = 2*n-i;
    }
    //stars
    for(int j=1;j<=stars;j++){
      System.out.print("*");
    }
    //spaces
    for(int j=1;j<=spaces;j++){
      System.out.print(" ");
    }
    //stars
    for(int j=1;j<=stars;j++){
      System.out.print("*");
    }
    System.out.println();
    if(i<n){
      spaces -= 2;
    }
    else{
      spaces += 2;
    }
  }

  //Pattern 21
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(i == 0 || j == 0 || i == n-1 || j == n-1){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }
  
  //Pattern 22
   for(int i=0;i<2*n-1;i++){
    for(int j=0;j<2*n-1;j++){
      int top=i;
      int left=j;
      int right=(2*n-2)-j;
      int bottom=(2*n-2)-i;
      System.out.print(n- Math.min(Math.min(top,bottom),Math.min(left,right)));
    }
    System.out.println();
   }

  }
}
