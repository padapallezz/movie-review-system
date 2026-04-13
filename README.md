# Movie Review and Rating System

A Spring Boot web application for browsing movies, submitting ratings & reviews, viewing average ratings, searching, and admin management.

**Tech Stack:**
- Backend: Spring Boot (Spring Web + Spring Data JPA)
- Database: MySQL
- Frontend: Thymeleaf + Bootstrap 5 + HTML + CSS + JavaScript
- Build Tool: Maven

## Current Progress (Updated - April 10, 2026)

COMPLETED:
- All JPA Entities (`User`, `Movie`, `Review`, `Role`)
- Repositories:
  - `MovieRepository.java`
  - `ReviewRepository.java`
  - `UserRepository.java`
- Services:
  - `ReviewService.java`
REMAINING TASKS:
- Database schema (`database_schema.sql`)
- `MovieController`+`MovieSerivce`
- `UserService.java` (for login/register logic)
- `AuthController.java` + `login.html` and `register.html`
- `movie-detail.html` (main page with reviews + interactive star rating)
- `star-rating.js` + `style.css`
- Search functionality (`search.html`)
- Admin Panel (CRUD for movies)
- Basic authentication / session management

## Project Structure

```bash
movie-review-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/moviereview/
│   │   │       ├── MovieReviewApplication.java
│   │   │       ├── config/
│   │   │       ├── controller/
│   │   │       │   ├── MovieController.java          ← COMPLETED
│   │   │       ├── entity/                            ← COMPLETED
│   │   │       ├── repository/                        ← ALL COMPLETED
│   │   │       ├── service/
│   │   │       │   ├── MovieService.java             ← TODO
│   │   │       │   ├── ReviewService.java            ← COMPLETED
│   │   │       │   └── UserService.java              ← TODO (High Priority)
│   │   │       └── dto/ (optional)
│   │   │
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   ├── css/
│   │   │   │   │   └── style.css
│   │   │   │   └── js/
│   │   │   │       └── star-rating.js
│   │   │   └── templates/                            ← TODO 
│   │   │       ├── index.html
│   │   │       ├── movie-detail.html                 
│   │   │       ├── search.html
│   │   │       ├── login.html
│   │   │       ├── register.html
│   │   │       └── admin/
│   │   │
│   │   └── application.properties
│   │
├── database_schema.sql                                ← TODO
├── pom.xml
├── README.md
