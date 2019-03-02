package KeyWordDriven;

import java.io.IOException;

public class TC {

	public static void main(String[] args) throws IOException {
		
		String path = "E:\\Abhresh\\EdurekaPrograms\\Edureka_26th_Jan\\src\\KeyWordDriven\\MyDataEngine.xlsx";

		ExcelUtility.setexcel(path, 0);
		
		for(int i=0; i<=3; i++) 
		{
			String Keyword = ExcelUtility.GetData(i, 1);
			if(Keyword.equals("OpenBrowser"))
			{
				ActionKeywords.OpenBrowser();
			}
			else if (Keyword.equals("Navigate"))
			{
				ActionKeywords.Navigate();
			}
			else if (Keyword.equals("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}
		}
		
	}

}
