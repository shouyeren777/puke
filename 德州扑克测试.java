package first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pukeTest {

	@Test
	void TongHuaVSSanPai() {//ͬ��vs˳��
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"2H","3H","5H","9H","KH"};
		String whitepk[]= {"2C","3H","4S","5C","6H"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("ͬ��vs˳��:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void TongHuaVSTongHuaShun() {//ͬ��vsͬ��˳
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"2H","3H","5H","9H","KH"};
		String whitepk[]= {"3C","4C","5C","6C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("ͬ��vsͬ��˳:");
	     puke1.cmppk(a,b,c,d);
	}
	
	
	@Test
	void ShunZiVSSanTiao() {//����vs˳��
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"2H","2C","2D","4H","KH"};
		String whitepk[]= {"3C","4C","5H","6C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("����vs˳��:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void SantiaoVSLiangdui() {//����vs����
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"3H","3D","3C","4H","KH"};
		String whitepk[]= {"3C","3H","5H","5C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("����vs����:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void liangduivsduizi() {//����vs����
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"3H","3D","7C","4H","KH"};
		String whitepk[]= {"3C","3H","5H","5C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("����vs����:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void duizivssanpai() {//ɢ��vs����
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"3H","3D","7C","4H","KH"};
		String whitepk[]= {"3C","4H","5H","9C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("ɢ��vs����:");
	     puke1.cmppk(a,b,c,d);
	}

	@Test
	void tonghuashunvssanpai() {//ͬ��˳vsɢ��
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"3H","4H","5H","6H","7H"};
		String whitepk[]= {"3C","4H","5H","9C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("ͬ��˳vsɢ��:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void sanpaivssanpaino() {//ɢ��vsɢ�Ʋ����
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"2H","4C","5H","8H","7H"};
		String whitepk[]= {"3C","4H","5H","9C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("ɢ��vsɢ��:");
	     puke1.cmppk(a,b,c,d);
	}
	@Test
	void sanpaivssanpaiyes() {//ɢ��vsɢ�����
		int a[]=new int[5];
	     char b[]=new char[5];
	     int c[]=new int[5];
	     char d[]=new char[5];
		puke puke1=new puke();
		String blackpk[]= {"2H","4C","5H","8H","7H"};
		String whitepk[]= {"2C","4H","5H","8C","7C"};
		a= puke1.sort(puke1.getpk(blackpk)) ;
	     b= puke1.geths(blackpk) ;
	     c= puke1.sort(puke1.getpk(whitepk)) ;
	     d= puke1.geths(whitepk) ;
	     System.out.print("ɢ��vsɢ��:");
	     puke1.cmppk(a,b,c,d);
	}

}
