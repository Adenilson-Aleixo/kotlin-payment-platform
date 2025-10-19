rootProject.name = "kotlin-payment-platform"

include(
    "account-service",
    "payment-service",
    "billing-service",
    "notification-service",
    "fraud-service",
    "audit-service",
    "libs:common",
    "libs:kotlin-core"
)
