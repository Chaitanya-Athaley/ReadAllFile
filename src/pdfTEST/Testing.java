package pdfTEST;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Testing {
	private String address;
	private String name;
	private String phone;
	private String website;
	private String issueDate;
	private String country;
	private String url;
	public boolean crawlWebPage() {

		ArrayList<JfsaModel> finalList = new ArrayList<>();
		String entity = "";
		String regionalOffice = "";
		String address1 = "";
		String address2 = "";
		String address3 = "";
		String city = "";
		String state = "";
		String zipcode = "";
		String email = "";
		String fax = "";
		String url = "";
		String country = "India";
		String pageSource = "";
		try{
			File file = new File("C:\\Users\\tek\\Downloads\\202012-1.xlsx");   //creating a new file instance  
			FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
			XSSFWorkbook wb = new XSSFWorkbook(fis);   
			XSSFSheet sh = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
			int rowcount    =     sh.getLastRowNum();
			for(int i=3;i<=rowcount;i++)
			{
				short columncount              =    sh.getRow(i).getLastCellNum();
				for(int j=0;j<columncount;j++)
				{

					if(j==0)
					{
						name= sh.getRow(i).getCell(j).getStringCellValue();
					}
					if(j==1)
					{
						address= sh.getRow(i).getCell(j).getStringCellValue();
					}
					if(j==2)
					{
						phone= sh.getRow(i).getCell(j).getStringCellValue();
					}
					if(j==3)
					{
						website= sh.getRow(i).getCell(j).getStringCellValue();
					}
					if(j==4)
					{
						issueDate= sh.getRow(i).getCell(j).getStringCellValue();
					}
				}
				finalList.add(new JfsaModel(name.trim(), address.trim(), phone.trim(), website.trim(), issueDate.trim(), country.trim(), url.trim()));
				System.out.println("name======"+name);
				System.out.println("address======"+address);
				System.out.println("phone======"+phone);
				System.out.println("website======"+website);

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		Testing t = new Testing();
		t.crawlWebPage();
	}

}
