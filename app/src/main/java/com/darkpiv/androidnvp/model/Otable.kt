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
data class ListTaskOtableResponse(
    @SerializedName("meta")
    var meta: Meta?,
    @SerializedName("result")
    var result: List<TaskOtable>?
)

data class TaskOtable(
    @SerializedName("backlog")
    var backlog: Backlog?,
    @SerializedName("dueDate")
    var dueDate: Int?,
    @SerializedName("estimatedHours")
    var estimatedHours: String?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("iteration")
    var iteration: Iteration?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("project")
    var project: Project?,
    @SerializedName("status")
    var status: Boolean?,
    @SerializedName("userId")
    var userId: String?
)

data class Backlog(
    @SerializedName("id")
    var id: String?,
    @SerializedName("name")
    var name: String?
)

data class Iteration(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?
)

data class Project(
    @SerializedName("id")
    var id: String?,
    @SerializedName("name")
    var name: String?
)