class News {
  final String author,
      title,
      description,
      url,
      urlToImage,
      publishedAt,
      content,
      name;

  News(this.author, this.title, this.description, this.url, this.urlToImage,
      this.publishedAt, this.content, this.name);

  News.fromJson(Map<String, dynamic> json)
      : author = json['author'],
        title = json['title'],
        description = json['description'],
        url = json['url'],
        urlToImage = json['urlToImage'],
        publishedAt = json['publishedAt'],
        content = json['content'],
        name = json['source']['name'];

  Map<String, dynamic> toJson() => {
        'author': author,
        'title': title,
        'description': description,
        'url': url,
        'urlToImage': urlToImage,
        'publishedAt': publishedAt,
        'content': content,
        'name': name,
      };
}
