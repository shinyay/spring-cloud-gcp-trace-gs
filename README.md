# Spring Cloud GCP for Cloud Trace Getting Started

Cloud Trace is a distributed tracing system for Google Cloud that collects latency data from applications and displays it in near real-time in the Google Cloud Console.

## Description
### Dependency
- com.google.cloud
  - `spring-cloud-gcp-starter-trace`

### Traceability Terminology
![trace-span](https://user-images.githubusercontent.com/3072734/104860246-cb2d8f00-596d-11eb-81aa-9085bc1525d1.jpg)

- **Trace**
  - Single Request or Job that is triggered in an application
  - Trace represents the whole journey of a request
    - **Trace ID** is generated when the first request is made
- **Span**
  - Sections of a job or request
  - Span is each individual hop along the way, each request
  - Single trace can be composed of multiple spans each correlating to a specific step or section of the request
    - **Span ID** is assigned for that component and added to the trace
## Demo
### Setup Cloud Trace
#### Enable Cloud Trace API
```shell script
$ gcloud services enable cloudtrace.googleapis.com
```


## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## References
- [Spring Cloud Sleuth Reference Documentation](https://docs.spring.io/spring-cloud-sleuth/docs/current-SNAPSHOT/reference/html/index.html)
  - [Spring Cloud Sleuth Properties](https://docs.spring.io/spring-cloud-sleuth/docs/current-SNAPSHOT/reference/html/appendix.html)
## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
