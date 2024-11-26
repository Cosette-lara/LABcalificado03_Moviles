package com.lara.cosette.ejercicio01

data class TeacherListResponse(
    val count: Int,
    val next: String?,
    val teachers: List<TeacherResponse>
)
