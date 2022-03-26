package com.artemissoftware.parkingspotfinder.presentation

import com.artemissoftware.parkingspotfinder.domain.model.ParkingSpot
import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)
