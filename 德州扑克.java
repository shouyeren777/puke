package first;

public class puke {
	//检查同花顺
    public static boolean checkths(int a[],char b[]) {
    	if (a[0]+4==a[1]+3&&a[2]+2==a[3]+1&&a[3]+1==a[4]&&b[0]==b[1]&&b[2]==b[3]&&b[1]==b[4]) {
    		return true;
    	}
    	else return false;
    }
    
    //检查同花
    public static boolean checkth(char b[]) {
    	if (b[0]==b[1]&&b[2]==b[3]&&b[1]==b[4]) {
    		return true;
    	}
    	else return false;   	
    }
    //检查顺子
    public static boolean checksz(int a[]) {
    	if (a[0]+4==a[1]+3&&a[2]+2==a[3]+1&&a[3]+1==a[4]) {
    		return true;
    	}
    	else return false;   	
    }
    
    //检查三条
    public static boolean checkst(int a[]) {
    	if (a[0]==a[2]||a[1]==a[3]||a[2]==a[4]) {
    		return true;
    	}
    	else return false;   	
    }
    
    //检查对子
    public static boolean checkdz(int a[]) {
    	if (a[0]==a[1]||a[1]==a[2]||a[2]==a[3]||a[3]==a[4]) {
    		return true;
    	}
    	else return false;   	
    }
    
    //比较同花顺
    public static void cmpths(int a[] ,int b[]) {
    	if (a[0]==b[0]) {
    		System.out.println("Tie");
    	}
    	else if (a[0]<b[0]) {
    		System.out.println("White Win");
    	}
    	else {
    		System.out.println("Black Win");
    	}
    }
    
    
    //比较同花
    public static void cmpth(int a[] ,int b[]) {
    	if (a[4]==b[4]) {
    		if (a[3]==b[3]) {
    			if (a[2]==b[2]) {
    				if (a[1]==b[1]) {
    					if (a[0]==b[0]) {
    			    		System.out.println("Tie");
    			    	}
    			    	else if (a[0]<b[0]) {
    			    		System.out.println("White Win");
    			    	}
    			    	else {
    			    		System.out.println("Black Win");
    			    	}
    		    	}
    		    	else if (a[1]<b[1]) {
    		    		System.out.println("White Win");
    		    	}
    		    	else {
    		    		System.out.println("Black Win");
    		    	}
    	    	}
    	    	else if (a[2]<b[2]) {
    	    		System.out.println("White Win");
    	    	}
    	    	else {
    	    		System.out.println("Black Win");
    	    	}
        	
        	}
        	else if (a[3]<b[3]) {
        		System.out.println("White Win");
        	}
        	else {
        		System.out.println("Black Win");
        	}

    	}
    	else if (a[4]<b[4]) {
    		System.out.println("White Win");
    	}
    	else {
    		System.out.println("Black Win");
    	}
    }
    
    //比较顺子
    public static void cmpsz(int a[] ,int b[]) {
    	if (a[4]==b[4]) {
    		System.out.println("Tie");
    	}
    	else if (a[4]<b[4]) {
    		System.out.println("White Win");
    	}
    	else {
    		System.out.println("Black Win");
    	}
    }

    
    //比较三条
    public static void cmpst(int a[] ,int b[]) {
    	int black,white;
    	if (a[0]==a[2]) {
    		black=0;
    	}
    	else if (a[1]==a[3]) {
    		black=1;
    	}
    	else  {
    		black=2;
    	}
    	if (b[0]==b[2]) {
    		white=0;
    	}
    	else if (b[1]==b[3]) {
    		white=1;
    	}
    	else  {
    		white=2;
    	}
    	if (a[black]==b[white]) {
    		System.out.println("Tie");
    	}
    	else if (a[black]<b[white]) {
    		System.out.println("White Win");
    	}
    	else {
    		System.out.println("Black Win");
    	}
    }
    
    
    //两对重新排序
    public static int[] ldpaixu(int a[]) {
    	int temp;
    	if(a[0]!=a[1]) {
    	   temp=a[0];
    	   a[0]=a[2];
    	   a[2]=a[4];
    	   a[4]=temp;
    	}
    	else if (a[2]!=a[3]) {
     	   temp=a[2];
     	   a[2]=a[4];
     	   a[4]=temp;
     	}
    	return a;
    }
    
    
    //一对重新排序
    public static int[] ydpaixu(int a[]) {
    	int temp;
    	if(a[1]==a[2]) {
    	   temp=a[0];
    	   a[0]=a[2];
    	   a[2]=temp;
    	}
    	else if (a[2]==a[3]) {
     	   temp=a[2];
       	   a[3]=a[1];
     	   a[2]=a[0];
     	   a[1]=temp;
     	   a[0]=temp;
     	}
    	else if (a[3]==a[4]) {
      	   temp=a[3];
      	   a[4]=a[2];
      	   a[3]=a[1];
      	   a[2]=a[0];
      	   a[1]=temp;
      	   a[0]=temp;
      	}
    	return a;
    }
    
    
    //比较对子
    public static void cmpdz(int a[] ,int b[]) {
    	int black=0,white=0;
    	int black1,white1;
    	for(int i =0;i<4;i++) {
    		if (a[i]==a[i+1]) {
    			black++;
    		    black1=i;
    		}  	
    	}
    	for(int i =0;i<4;i++) {
    		if (b[i]==b[i+1]) {
    			white++;
    			white1=i;
    		}   		
    	}
    	if(black==2&&white==2) {
    		a=ldpaixu(a);
    		b=ldpaixu(b);
    		if (a[2]==b[2]) {
    			if (a[0]==b[0]) {
    				if (a[4]==b[4]) {
    		    		System.out.println("Tie");
    		    	}
    		    	else if (a[4]<b[4]) {
    		    		System.out.println("White Win");
    		    	}
    		    	else {
    		    		System.out.println("Black Win");
    		    	}
    	    	}
    	    	else if (a[0]<b[0]) {
    	    		System.out.println("White Win");
    	    	}
    	    	else {
    	    		System.out.println("Black Win");
    	    	}
        	}
        	else if (a[2]<b[2]) {
        		System.out.println("White Win");
        	}
        	else {
        		System.out.println("Black Win");
        	}
    	}
    	else if(black==2&&white==1) {
    		System.out.println("Black Win");
    	}
    	else if(black==1&&white==2) {
    		System.out.println("white Win");
    	}
    	else {
    		a=ydpaixu(a);
    		b=ydpaixu(b);
    		if (a[0]==b[0]) {
    			if (a[4]==b[4]) {
    				if (a[3]==b[3]) {
    					if (a[2]==b[2]) {
    			    		System.out.println("Tie");
    			    	}
    			    	else if (a[2]<b[2]) {
    			    		System.out.println("White Win");
    			    	}
    			    	else {
    			    		System.out.println("Black Win");
    			    	}
    		    	}
    		    	else if (a[3]<b[3]) {
    		    		System.out.println("White Win");
    		    	}
    		    	else {
    		    		System.out.println("Black Win");
    		    	}
    	    	}
    	    	else if (a[4]<b[4]) {
    	    		System.out.println("White Win");
    	    	}
    	    	else {
    	    		System.out.println("Black Win");
    	    	}
        	}
        	else if (a[0]<b[0]) {
        		System.out.println("White Win");
        	}
        	else {
        		System.out.println("Black Win");
        	}
    	}

    }
    //比较散排
    public static void cmpsp(int a[] ,int b[]) {
    	if (a[4]==b[4]) {
    		if (a[3]==b[3]) {
    			if (a[2]==b[2]) {
    				if (a[1]==b[1]) {
    					if (a[0]==b[0]) {
    			    		System.out.println("Tie");
    			    	}
    			    	else if (a[0]<b[0]) {
    			    		System.out.println("White Win");
    			    	}
    			    	else {
    			    		System.out.println("Black Win");
    			    	}
    		    	}
    		    	else if (a[1]<b[1]) {
    		    		System.out.println("White Win");
    		    	}
    		    	else {
    		    		System.out.println("Black Win");
    		    	}
    	    	}
    	    	else if (a[2]<b[2]) {
    	    		System.out.println("White Win");
    	    	}
    	    	else {
    	    		System.out.println("Black Win");
    	    	}
        	
        	}
        	else if (a[3]<b[3]) {
        		System.out.println("White Win");
        	}
        	else {
        		System.out.println("Black Win");
        	}

    	}
    	else if (a[4]<b[4]) {
    		System.out.println("White Win");
    	}
    	else {
    		System.out.println("Black Win");
    	}
    }
    // 排序
    public static int[] getpk(String pk[]) {
    	String s=pk[0]+pk[1]+pk[2]+pk[3]+pk[4];
    	char temp[]=new char[20];
        int a[]=new int [5];
        for(int i =0;i<10;i++) {
       	 temp[i]=s.charAt(i);
        }
        for(int i=0;i<5;i++) {
       	if(temp[2*i]=='2') a[i]=2;
       	else if(temp[2*i]=='3') a[i]=3;
       	else if(temp[2*i]=='4') a[i]=4;
       	else if(temp[2*i]=='5') a[i]=5;
       	else if(temp[2*i]=='6') a[i]=6;
       	else if(temp[2*i]=='7') a[i]=7;
       	else if(temp[2*i]=='8') a[i]=8;
       	else if(temp[2*i]=='9') a[i]=9;
       	else if(temp[2*i]=='T') a[i]=10;
       	else if(temp[2*i]=='J') a[i]=11;
       	else if(temp[2*i]=='Q') a[i]=12;
       	else if(temp[2*i]=='K') a[i]=13;
       	else if(temp[2*i]=='A') a[i]=14;
        }
    	return a;
    }
    //得到花色
    public static char[] geths(String pk[]) {
    	String s=pk[0]+pk[1]+pk[2]+pk[3]+pk[4];
    	char temp[]=new char[20];
        char b[]=new char [5];
        for(int i =0;i<10;i++) {
       	 temp[i]=s.charAt(i);
        }
        for(int i=0;i<5;i++) {
       	 b[i]=temp[2*i+1];       
        }
        return b;
    }
    //初次排序
    public static int[] sort(int a[]) {
    	 int temp1;
      	 for(int i =0;i<5;i++) {
      		 for (int j=i;j<5;j++) {
      			 if(a[j]<a[i]) {
      				 temp1=a[j];
      				 a[j]=a[i];
      				 a[i]=temp1;
      				 		
      				 }
      		 }
      	 }
      	 return a;
    }
    
    //比较扑克大小
    public static void cmppk(int a[] ,char b[],int c[],char d[]) {
        int black=0,white=0;
         //检查手牌类型
    	 if (checkths(a,b)) {
        	 black =5;
         }
         else if(checkth(b)) {
        	 black =4;
         }
         else if(checksz(a)) {
        	 black =3;
         }
         else if(checkst(a)) {
        	 black =2;
         }
         else if(checkdz(a)) {
        	 black =1;
         }
    	 
         if (checkths(c,d)) {
        	 white =5;
         }
         else if(checkth(d)) {
        	 white =4;
         }
         else if(checksz(c)) {
        	 white =3;
         }
         else if(checkst(c)) {
        	 white =2;
         }
         else if(checkdz(c)) {
        	 white =1;
         }
         
         //比较手牌大小
         if(black>white) {
        	 System.out.println("Black Win");
         }
         else if(black<white) {
        	 System.out.println("white Win");
         }
         else if(black==0) {
        	 cmpsp(a,c);
         }
         else if(black==1) {
        	 cmpdz(a,c);
         }
         else if(black==2) {
        	 cmpst(a,c);
         }
         else if(black==3) {
        	 cmpsz(a,c);
         }
         else if(black==4) {
        	 cmpth(a,c);
         }
         else if(black==5) {
        	 cmpths(a,c);
         }
    }

	/*public static void main(String[] args) {
		// TODO 自动生成的方法存根
     int a[]=new int[5];
     char b[]=new char[5];
     int c[]=new int[5];
     char d[]=new char[5];
     int black=0,white=0;
     String blackpk[]= {"2H","3H","5H","9H","KH"};
	 String whitepk[]= {"2C","3H","4S","5C","6H"};
     a= sort(getpk(blackpk)) ;
     b= geths(blackpk) ;
     c= sort(getpk(whitepk)) ;
     d= geths(whitepk) ;
     cmppk(a,b,c,d);
	}*/

}
