package rwg.util;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Logger {
	public static void log(Level level, String format, Object... data) {
		FMLLog.log(References.MODID, level, format, data);
	}

	public static void log(Level level, Throwable throwable, String format, Object... data) {
		FMLLog.log(References.MODID, level, throwable, format, data);
	}


	public static void fatal(String format, Object... data) {
		log(Level.FATAL, format, data);
	}

	public static void fatal(Throwable throwable, String format,
							 Object... data) {
		log(Level.FATAL, throwable, format, data);
	}

	public static void error(String format, Object... data) {
		log(Level.ERROR, format, data);
	}

	public static void error(Throwable throwable, String format,
							 Object... data) {
		log(Level.ERROR, throwable, format, data);
	}

	public static void warn(String format, Object... data) {
		log(Level.WARN, format, data);
	}

	public static void info(String format, Object... data) {
		log(Level.INFO, format, data);
	}

	public static void debug(String format, Object... data) {
		log(Level.DEBUG, format, data);
	}
}
