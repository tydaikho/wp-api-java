# WP_API client for Java

> This library is an isomorphic client for the [WordPress REST API](http://developer.wordpress.org/rest-api), designed to work with WordPress 4.7 or later. If you are using the older [WP REST API plugin](https://github.com/WP-API/WP-API), some commands will not work.

## Getting Started

Here are some instructions for using the library.

### Gradle

```groovy
implementation 'com.google.code.gson:gson:2.8.5'
implementation 'com.squareup.retrofit2:retrofit:2.4.0'
implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
implementation project(path: ':wp-api-java')
```

### Create Instance

```java
WP_API wp_api = new WP_API("http://demo.wp-api.org/wp-json/");
```

### Get a list of posts

```java
Call<ArrayList<Post>> postListCall = wp_api.posts()
    .page(1)
    .perPage(2)
    .author("1")
    .get();
```

###### or

```java
Call<ArrayList<Post>> postListCall = wp_api.posts()
    .argument("page", "1")
    .argument("per_page", "2")
    .argument("author", "1")
    .get();
```

### Get the post with ID 15

```java
Call<Post> postCall = wp_api.posts().id(15);
```

### Get a list of pages

```java
Call<ArrayList<Page>> pageListCall = wp_api.pages()
    .page(1)
    .perPage(2)
    .author("1")
    .get();
```

###### or

```java
Call<ArrayList<Page>> pageListCall = wp_api.pages()
    .argument("page", "1")
    .argument("per_page", "2")
    .argument("author", "1")
    .get();
```

### Get the page with ID 31

```java
Call<Page> pageCall = wp_api.pages().id(31);
```

### Get a list of comments
```java
Call<ArrayList<Comment>> commentListCall = wp_api.comments()
    .post(1)
    .perPage(2)
    .get();
```

###### or

```java
Call<ArrayList<Comment>> commentListCall = wp_api.comments()
    .argument("post", "1")
    .argument("per_page", "2")
    .get();
```

### Get the comment with ID 1

```java
Call<Comment> commentCall = wp_api.comments().id(31);
```

## Supported REST Methods

|                    | Create  | Read    | Update  | Delete  |
|--------------------|---------|---------|---------|---------|
| **Posts**          | ---     | yes     | ---     | ---     |
| **Pages**          | ---     | yes     | ---     | ---     |
| **Comments**       | ---     | yes     | ---     | ---     |
| **Categories**     | ---     | ---     | ---     | ---     |
| **Tags**           | ---     | ---     | ---     | ---     |
| **Users**          | ---     | ---     | ---     | ---     |
| **Media**          | ---     | ---     | ---     | ---     |
| **Post Revisions** | ---     | ---     | ---     | ---     |
| **Taxonomies**     | ---     | ---     | ---     | ---     |
| **Post Types**     | ---     | ---     | ---     | ---     |
| **Post Statuses**  | ---     | ---     | ---     | ---     |
| **Settings**       | ---     | ---     | ---     | ---     |

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/eduardorengifo/wp-api-java/blob/master/LICENSE) file for details