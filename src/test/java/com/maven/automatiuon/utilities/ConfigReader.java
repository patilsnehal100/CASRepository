package com.maven.automatiuon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	public ConfigReader() throws IOException
	{
	  File src=new File("./Configuration/config.properties");
	   try{
		   FileInputStream fis=new FileInputStream(src);
		   pro=new Properties();
		   pro.load(fis);
	      }catch (Exception e) {System.out.println("Exception is "+e.getMessage());}
	 }
	
	public String getBrowserName(){ String browsername=pro.getProperty("BrowserType");return browsername;}
	
	public String get_salesforce_csvUsername(){ String username=pro.getProperty("Username");return username;}
	
	public String get_salesforce_csvPassword(){String password=pro.getProperty("Password"); return password;}
	
	public String getsalesloft_Username(){ String username=pro.getProperty("Username");return username;}
	
	public String getsalesloft_Password(){String password=pro.getProperty("Password"); return password;}
	
	public String getUrl(){ String url=pro.getProperty("URL");return url;}
	
	public String getCsvInd_Listname(){ String csvListName=pro.getProperty("CSVIndividualListName");return csvListName;}
	
	public String getCsvLead_Listname(){ String csvListName=pro.getProperty("CSVLeadpoolListName");return csvListName;}
	
	public String getSalesforceInd_Listname(){ String salesforceListName=pro.getProperty("SalesforceIndividualListName"); return salesforceListName;}
	
	public String getSalesforceLead_Listname(){ String salesforceListName=pro.getProperty("SalesforceLeadpoolListName"); return salesforceListName;}
	
	public String getSalesforceTemp_Listname(){ String salesforceListName=pro.getProperty("SalesforceTemplateListName"); return salesforceListName;}
	
	
	public String getCsvIndividualIndex(){String index=pro.getProperty("CSVIndidual_Index");return index;}
	
	public String getSalesloftMycad_list() { String salesloftListname=pro.getProperty("SalesloftMycadenceListName"); return salesloftListname;}
	
    public String getSalesloftTeamcad_list() { String salesloftListname=pro.getProperty("SalesloftTeamcadenceListName"); return salesloftListname;}
}
