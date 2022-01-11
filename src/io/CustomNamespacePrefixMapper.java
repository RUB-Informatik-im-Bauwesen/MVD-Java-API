package io;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;




public class CustomNamespacePrefixMapper extends NamespacePrefixMapper {

	private Map<String, String> namespaceMap = new HashMap<String, String>();
	
	public CustomNamespacePrefixMapper() {
		namespaceMap.put("http://buildingsmart-tech.org/mvd/XML/1.1", "xmlns");
//		namespaceMap.put("http://www.w3.org/2001/XMLSchema", "xs");
//		namespaceMap.put("http://www.w3.org/1999/xlink", "xlink");
		
	}
	
	
	
	@Override
	public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
		return namespaceMap.getOrDefault(arg0, arg1);
	}


}
