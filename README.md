# Overview
* This repository contains a collection of Spring Boot mini projects designed to help you understand how Spring works internally, not just how to use it.
* Instead of focusing on annotations and configuration alone, these projects dive into core Spring architecture, internal mechanisms, and design patterns—the exact areas most commonly discussed in Spring.
---
## Goals of This Repository
* Understand Spring Core internals and framework design
* Learn why Spring works the way it does
---
## Key Topics Covered

### Core Spring Internals
- Inversion of Control (IoC) & Dependency Injection
- Bean lifecycle and scopes
- ApplicationContext vs BeanFactory
- Spring Boot startup flow

### Auto-Configuration
- How auto-configuration works internally
- Conditional annotations
- Classpath-based configuration

### AOP & Proxies
- JDK Dynamic Proxy vs CGLIB
- Aspect execution flow
- Proxy limitations and self-invocation

### Transactions
- How @Transactional works internally
- Transaction propagation and isolation
- Common transaction pitfalls

### Web & Exception Handling
- DispatcherServlet request flow
- Filters vs Interceptors
- Global exception handling

### Caching
- Spring Cache abstraction
- CacheManager architecture
- In-memory vs distributed cache

### Security
- Spring Security filter chain
- Authentication vs Authorization
- JWT request flow

### Configuration
- Property source precedence
- Profiles and environment abstraction
