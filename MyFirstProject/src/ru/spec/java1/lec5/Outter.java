package ru.spec.java1.lec5;

public class Outter {
	
	private static int i;
	
	public static class StaticNested {
		public StaticNested() {
			System.out.println("StaticNested");
		}
	}
	
	public class Nested {
		
		public Nested() {
			System.out.println("Nested");
		}
		
	}
	
	public static void main(String[] args) {
		new Outter.StaticNested();
		new Outter().new Nested();
		
		int i = 5;
		
		class Inner {
			public Inner() {
				
			}
			
			public void m() {
				System.out.println("m() = " + i);
			}
		}
		
		new Inner().m();
		
		
		class Bing extends WebSite {
			@Override
			public String getTitle() {
				return "Bing";
			}
		}
		
		
		
		WebSite site = new WebSite() {
			
			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return "Yahoo";
			}
		};
		
	}
	
}
