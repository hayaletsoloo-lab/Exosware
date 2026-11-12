package ru.levin.util.render.providers;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public final class ResourceProvider {
	public static final ShaderProgramKey TEXTURE_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("texture"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey RECTANGLE_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("rectangle"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey BLUR_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("blur"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey RECTANGLE_BORDER_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("border"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey GLASS_SHADER_KEY = new ShaderProgramKey(getGlass("data"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY);

	public static final Identifier firefly = Identifier.of("lt2girlware", "images/particles/firefly.png");
	public static final Identifier bloom = Identifier.of("lt2girlware", "images/particles/bloom.png");
	public static final Identifier snowflake = Identifier.of("lt2girlware", "images/particles/snowflake.png");
	public static final Identifier dollar = Identifier.of("lt2girlware", "images/particles/dollar.png");
	public static final Identifier heart = Identifier.of("lt2girlware", "images/particles/heart.png");
	public static final Identifier star = Identifier.of("lt2girlware", "images/particles/star.png");
	public static final Identifier spark = Identifier.of("lt2girlware", "images/particles/spark.png");
	public static final Identifier crown = Identifier.of("lt2girlware", "images/particles/crown.png");
	public static final Identifier lightning = Identifier.of("lt2girlware", "images/particles/lightning.png");
	public static final Identifier line = Identifier.of("lt2girlware", "images/particles/line.png");
	public static final Identifier point = Identifier.of("lt2girlware", "images/particles/point.png");
	public static final Identifier rhombus = Identifier.of("lt2girlware", "images/particles/rhombus.png");


	public static final Identifier marker = Identifier.of("lt2girlware", "images/targetesp/target.png");
	public static final Identifier marker2 = Identifier.of("lt2girlware", "images/targetesp/target2.png");


	public static final Identifier CUSTOM_CAPE = Identifier.of("lt2girlware", "cape/cape.png");
	public static final Identifier CUSTOM_ELYTRA = Identifier.of("lt2girlware", "cape/elytra.png");

	public static final Identifier container = Identifier.of("lt2girlware", "images/hud/container.png");

	public static final Identifier color_image = Identifier.of("lt2girlware", "images/gui/pick.png");


	private static Identifier getGlass(String name) {
		return Identifier.of("lt2girlware", "core/glass/" + name);
	}
	private static Identifier getShaderIdentifier(String name) {
		return Identifier.of("lt2girlware", "core/" + name);
	}
}