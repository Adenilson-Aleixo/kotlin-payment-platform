# kotlin-payment-platform (starter)

Mono-repo starter for the Payment & Billing Platform (Kotlin + Spring Boot + AWS-ready).

## How to use

1. Start infrastructure locally:
   ```bash
   cd infra/docker
   docker compose up -d
   ```

2. Run one service (example):
   ```bash
   ./gradlew :account-service:bootRun
   ```

3. Build all:
   ```bash
   ./gradlew build
   ```

## Next steps

- Add your GitHub repository named `kotlin-payment-platform`
- Push this starter to GitHub
- Start implementing features per the 12-week roadmap
