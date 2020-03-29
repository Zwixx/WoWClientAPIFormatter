package de.febrildur.wowclientapiformatter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.febrildur.wowclientapiformatter.dto.Event;
import de.febrildur.wowclientapiformatter.dto.WoWAPI;

public class Application {
	private static final ScriptEngineManager sem = new ScriptEngineManager();
	private static final ScriptEngine e = sem.getEngineByExtension(".lua");
	private static final ScriptEngineFactory f = e.getFactory();

	static {
		// uncomment to enable the lua-to-java bytecode compiler
		// (require bcel library in class path)
		// org.luaj.vm2.luajc.LuaJC.install();
		
		// System.out.println("Engine name: " + f.getEngineName());
		// System.out.println("Engine Version: " + f.getEngineVersion());
		// System.out.println("LanguageName: " + f.getLanguageName());
		// System.out.println("Language Version: " + f.getLanguageVersion());
	}

	public static void main(String[] args) throws Exception {
		Gson gson = new GsonBuilder().create();
		FileReader fr = new FileReader(new File("F:/Development/workspace/WoWClientAPIFormatter/src/main/resources/lua/api.json"));
		WoWAPI[] apis = gson.fromJson(fr, WoWAPI[].class);
		
		List<WoWAPI> apiFiltered = new ArrayList<>();
		
		String[] apiNames = new String[6];
		apiNames[0] = "AuctionHouse";
		apiNames[1] = "Calendar";
		apiNames[2] = "ChatChannel";
		apiNames[3] = "GarrTalent";
		apiNames[4] = "QuestSession";
		apiNames[5] = "RafLink";
		
		
		int unknownApi = 0;
		for(WoWAPI api : apis) {
			if (api.getName() == null) {
				if (!api.getTables().isEmpty() || api.getEvents() != null || api.getFunctions() != null) {
					api.setName("Unnamed API " + apiNames[unknownApi++]);
				}
			}
			if (api.getName() != null) {
				apiFiltered.add(api);
			}
			
		}
		
		HtmlOutput o = new HtmlOutput();
		o.Output(apiFiltered);
	}

}
