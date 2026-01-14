rootProject.name = "streamhub"

// Libs
include("libs:common")
include("libs:domain")
include("libs:events")
include("libs:persistence")
include("libs:messaging")
include("libs:security")
include("libs:web")

// Services
include("services:user-service")
include("services:stream-service")
include("services:video-service")
include("services:chat-service")
include("services:notification-service")
include("services:api-gateway")