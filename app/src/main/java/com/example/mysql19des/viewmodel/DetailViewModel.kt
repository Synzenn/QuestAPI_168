package com.example.mysql19des.viewmodel

import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mysql19des.modeldata.DataSiswa
import com.example.mysql19des.repositori.RepositoryDataSiswa
import com.example.mysql19des.uicontroller.route.DestinasiDetail
import kotlinx.coroutines.launch
import okio.IOException
import retrofit2.HttpException
import retrofit2.Response
