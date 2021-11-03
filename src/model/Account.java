package model;

import java.util.Map;
import java.util.TreeMap;

public class Account {
	TreeMap<String, String> mapAccount;

	public Account(TreeMap<String, String> mapAccount) {
		this.mapAccount = new TreeMap<String, String>();
	}

	public void register(String username, String password){
		mapAccount.put(username,password);
	}
	public Boolean login(String username, String password){
		boolean result = false;
		for (Map.Entry<String,String> entry : mapAccount.entrySet()) {
			if (entry.getKey().equals(username) && entry.getValue().equals(password))
				result = true;
			break;
		}
		return result;
	}
    public void deleteAccount(String username, String password) {
		for (Map.Entry<String, String> entry : mapAccount.entrySet()) {
			if (entry.getKey().equals(username) && entry.getValue().equals(password))
				mapAccount.remove(username);
		}
	}

}
