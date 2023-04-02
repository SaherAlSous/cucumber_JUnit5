package async

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class Repo {

    suspend fun calculate(first: Int, second: Int) = flow {
        Thread.sleep(2000)
        emit(first + second)
    }.flowOn(Dispatchers.IO)
}