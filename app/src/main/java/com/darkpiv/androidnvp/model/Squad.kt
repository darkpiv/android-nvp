package com.darkpiv.androidnvp.model

import com.google.gson.annotations.SerializedName


data class ListSquadResponse(
  @SerializedName("meta")
  var meta: Meta? = null,
  @SerializedName("result")
  var result: List<Squad>? = null
)

data class Meta(
  @SerializedName("ok")
  var ok: Boolean? = null
)

data class Squad(
  @SerializedName("expertiseRoles")
  var expertiseRoles: List<ExpertiseRole>? = null,
  @SerializedName("id")
  var id: Int? = null,
  @SerializedName("name")
  var name: String? = null,
  @SerializedName("totalTasks")
  var totalTasks: Int? = null
)

data class ExpertiseRole(
  @SerializedName("id")
  var id: Int? = null,
  @SerializedName("name")
  var name: String? = null,
  @SerializedName("short_name")
  var shortName: String? = null
)