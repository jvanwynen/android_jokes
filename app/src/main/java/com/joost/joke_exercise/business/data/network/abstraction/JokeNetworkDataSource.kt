package com.joost.joke_exercise.business.data.network.abstraction

import com.joost.joke_exercise.business.data.network.common.JokeResult
import com.joost.joke_exercise.business.domain.model.Joke
import com.joost.joke_exercise.framework.datasource.network.models.JokeApiResponse

interface JokeNetworkDataSource {

    suspend fun getJoke(category: String, type: String, flags: List<String>): JokeResult<Joke?>
}