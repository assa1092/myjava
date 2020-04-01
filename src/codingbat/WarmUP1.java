package codingbat;

public class WarmUP1 {
	//
		
		
		//////////////////////////////////
		
		public boolean sleepIn(boolean weekday, boolean vacation) {

			return !weekday || vacation;
		}

		
		////////////////////////////////// 
		
		public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
			return aSmile == bSmile;
		}
		//////////////////////////////////
		
		public int sumDouble(int a, int b) {
			int r = a + b;
			r = (a == b) ? r * 2 : r;
			return r;
		}

		//////////////////////////////////
		
		public int diff21(int n) {
			int r = 21 - n;
			r = (r < 0) ? -r : r;
			r = (n > 21) ? r * 2 : r;

			return r;
		}

		//////////////////////////////////
		
		public boolean parrotTrouble(boolean talking, int hour) {
			return talking && (hour < 7 || hour > 20);
		}

		//////////////////////////////////
		
		public boolean makes10(int a, int b) {
			boolean r = a == 10 || b == 10 || (a + b) == 10;
			return r;
		}
		
		
		
		//////////////////////////////////

		public boolean nearHundred(int n) {
			boolean r = (90 <= n && n <= 110) || (190 <= n && n <= 210);

			return r;
		}


		//////////////////////////////////
		
		public String notString(String str) {
			int len = str.length();

			if (len < 3) {
				return "not " + str;
			} else {
				String f = str.substring(0, 3);
				if (f.equals("not")) {
					return str;
				} else {
					return "not " + str;
				}
			}

		}
		
		
		////////////////////////////////////////////////////
		
		public String frontBack(String str) {
			if (str.length() > 1) {
				char c1 = str.charAt(0);
				char c2 = str.charAt(str.length() - 1);

				String mid = str.substring(1, str.length() - 1);

				return c2 + mid + c1;
			} else {
				return str;
			}

		}

}
