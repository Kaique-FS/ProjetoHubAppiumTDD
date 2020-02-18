package br.com.rsinet.hub.projetoAppiumTDD.utility;

public class Excel {

	public String usuario() throws Exception {
		ExcelUtils.setExcelFile("C:\\Users\\kaique.silva\\eclipse-workspace\\projetoAppiumTDD\\src\\main\\java\\br\\com\\rsinet\\hub\\projetoAppiumTDD\\excel\\Register.xlsx", "Planilha1");
		String usuario = ExcelUtils.getCellData(2, 0);
		return usuario;		
	}
	
	public String email() throws Exception {
		String sEmail = ExcelUtils.getCellData(2, 1);
		return sEmail;
	}

	public String senha() throws Exception {
		String sPassword = ExcelUtils.getCellData(2, 2);
		return sPassword;
	}

	public String primeiro_nome() throws Exception {
		String sFirstName = ExcelUtils.getCellData(2, 4);
		return sFirstName;
	}

	public String ultimo_nome() throws Exception {
		String sLastName = ExcelUtils.getCellData(2, 5);
		return sLastName;
	}

	public String numero_telefone() throws Exception {
		String sTelNumber = ExcelUtils.getCellData(2, 6);
		return sTelNumber;
	}

	public String nacionalidade() throws Exception {
		String sCountry = ExcelUtils.getCellData(2, 7);
		return sCountry;
	}

	public String estado() throws Exception {
		String sState = ExcelUtils.getCellData(2, 11);
		return sState;
	}

	public String endereco() throws Exception {
		String sAddress = ExcelUtils.getCellData(2, 9);
		return sAddress;
	}

	public String cidade() throws Exception {
		String sCity = ExcelUtils.getCellData(2, 8);
		return sCity;
	}

	public String codigo_postal() throws Exception {
		String sPostalCode = ExcelUtils.getCellData(2, 10);
		return sPostalCode;
	}

}
