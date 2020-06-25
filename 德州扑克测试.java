package first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pukeTest {

	@Test
	void TongHuaVSSanPai() {//同花vs顺子
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
	     System.out.print("同花vs顺子:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void TongHuaVSTongHuaShun() {//同花vs同花顺
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
	     System.out.print("同花vs同花顺:");
	     puke1.cmppk(a,b,c,d);
	}
	
	
	@Test
	void ShunZiVSSanTiao() {//三条vs顺子
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
	     System.out.print("三条vs顺子:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void SantiaoVSLiangdui() {//三条vs两对
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
	     System.out.print("三条vs两对:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void liangduivsduizi() {//两对vs对子
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
	     System.out.print("对子vs两对:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void duizivssanpai() {//散牌vs对子
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
	     System.out.print("散牌vs对子:");
	     puke1.cmppk(a,b,c,d);
	}

	@Test
	void tonghuashunvssanpai() {//同花顺vs散牌
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
	     System.out.print("同花顺vs散牌:");
	     puke1.cmppk(a,b,c,d);
	}
	
	@Test
	void sanpaivssanpaino() {//散牌vs散牌不相等
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
	     System.out.print("散牌vs散牌:");
	     puke1.cmppk(a,b,c,d);
	}
	@Test
	void sanpaivssanpaiyes() {//散牌vs散牌相等
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
	     System.out.print("散牌vs散牌:");
	     puke1.cmppk(a,b,c,d);
	}

}
