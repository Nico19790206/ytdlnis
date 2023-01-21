package com.deniscerri.ytdlnis.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "downloads")
data class DownloadItem(
    val url: String,
    val title: String,
    val author: String,
    val thumb: String,
    val duration: String,
    val type: String,
    val audioQualityId: String,
    val videoQualityId: String,
    val customTemplateId: Int,
    val audioFormat: String,
    val videoFormat: String,
    val formatDesc: String,
    @ColumnInfo(defaultValue = "0")
    val removeAudio: Boolean,
    val downloadPath: String,
    val website: String,
    val downloadSize: String,
    val playlistTitle: String,
    val embedSubs: Boolean,
    val addChapters: Boolean,
    val SaveThumb: Boolean,
    var ext: String,
    var filesize: String,
    @ColumnInfo(defaultValue = "Queued")
    var status: String,
    val workID: Int
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}