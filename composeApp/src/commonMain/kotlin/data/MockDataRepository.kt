package data

interface MockDataRepository {
    fun getMockData(): String
}

class MockDataRepositoryImpl : MockDataRepository {
    override fun getMockData(): String = "Mock data"
}
