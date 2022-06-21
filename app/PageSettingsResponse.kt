data class PageSettingsResponse(

	@Json(name="nextPageId")
	val nextPageId: String,

	@Json(name="wigets")
	val wigets: List<WigetsItem>,

	@Json(name="id")
	val id: String
)

data class HintItem(

	@Json(name="language")
	val language: String,

	@Json(name="value")
	val value: String
)

data class WigetsItem(

	@Json(name="cta")
	val cta: Cta,

	@Json(name="id")
	val id: String,

	@Json(name="type")
	val type: String,

	@Json(name="hint")
	val hint: List<HintItem>,

	@Json(name="inputKey")
	val inputKey: String,

	@Json(name="navigateTo")
	val navigateTo: String
)

data class Cta(

	@Json(name="method")
	val method: String,

	@Json(name="apiUrl")
	val apiUrl: String,

	@Json(name="type")
	val type: String
)

