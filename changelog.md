# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.2.0] - 2019-11-26

### Added
- Added 'AuditLoggerConsole' appender with marker filter 'AUDIT_LOG'

## [1.2.1] - 2019-11-27

### Changed
- RequestResponseLoggingFilter now looks for the fluentd host+port via environment variables instead of Java system properties
