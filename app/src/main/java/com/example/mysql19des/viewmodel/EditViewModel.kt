package com.example.mysql19des.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mysql19des.modeldata.DetailSiswa
import com.example.mysql19des.modeldata.UIStateSiswa
import com.example.mysql19des.modeldata.toDataSiswa
import com.example.mysql19des.modeldata.toUiStateSiswa
import com.example.mysql19des.repositori.RepositoryDataSiswa
import com.example.mysql19des.uicontroller.route.DestinasiDetail
import kotlinx.coroutines.launch
import retrofit2.Response
