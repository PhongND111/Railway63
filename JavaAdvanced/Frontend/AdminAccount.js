var listAccount = [];
var listDepartment = [];
var listPosition = [];
var currentPage = 1;
var currentSize = 5;

// khai báo biến dùng ở phần Sort
var sortField = "id";
var isAsc = true; // true: sort theo chiều asc

var v_search = "";
//load dữ liệu từ API để lấy danh sách Account và hiển thị ra giao diện
getListAccount();
getListDepartment();
getListPosition();

//khai báo hàm hiển thị danh sách Account
function getListAccount(params) {
  var v_url = "";

  if (isAsc) {
    v_url = `http://localhost:8080/api/v1/accounts?page=${currentPage}&size=${currentSize}&sort=${sortField},asc`;
  } else {
    v_url = `http://localhost:8080/api/v1/accounts?page=${currentPage}&size=${currentSize}&sort=${sortField},desc`;
  }

  v_url = v_url + "&search=" + v_search;

  $.ajax({
    type: "GET",
    // url: `http://localhost:8080/api/v1/accounts?page=${currentPage}&size=${currentSize}&sort=${sortField},desc`,
    url: v_url,
    data: "data",
    dataType: "json",
    beforeSend: function (xhr) {
      xhr.setRequestHeader(
        "Authorization",
        "Basic " +
          btoa(
            localStorage.getItem("username_LocalStorage") +
              ":" +
              localStorage.getItem("password_LocalStorage")
          )
      );
    },

    success: function (response) {
      console.log("response: ", response);
      //2. Hiển thị danh sách Account này ra giao diện
      listAccount = response.content;

      $("#Result_TB").empty();

      for (let index = 0; index < listAccount.length; index++) {
        $("#Result_TB").append(
          ` <tr>
      <td>${listAccount[index].id}</td>
      <td>${listAccount[index].email}</td>
      <td>${listAccount[index].username}</td>
      <td>${listAccount[index].fullname}</td>
      <td>${listAccount[index].department}</td>
      <td>${listAccount[index].position}</td>
      <td>${listAccount[index].createDate}</td>
      <td>
        <button type="button" class="btn btn-warning" onclick="editAccount(${index})">
          Edit
        </button>
      </td>
      <td>
        <button type="button" class="btn btn-danger" onclick="deleteAccount(${index})">
          Delete
        </button>
      </td>
    </tr>
    `
        );
      }

      //   <td>
      //   <button type="button" class="btn btn-info" onclick="duplicateAccount(${index})">
      //     Duplicate
      //   </button>
      // </td>

      var totalPages = response.totalPages;
      pagingTable(totalPages);
    },
  });
}

// hàm tạo nút paging
function pagingTable(totalPages_Param) {
  $("#pagination_id").empty();

  // Hiển thị nút << (First)
  // $("#pagination_id").append(
  //   `<li class="page-item"><a href="#" class="page-link" onclick="handleFirst()"><<</a></li>`
  // );

  // Hiển thị nút Previous
  if (currentPage > 1) {
    $("#pagination_id").append(
      `<li class="page-item"><a href="#" class="page-link" onclick="handlePrevious()">Previous</a></li>`
    );
  }

  // Hiển thị ra các nút 1,2,3,...
  for (let index = 1; index <= totalPages_Param; index++) {
    if (index === currentPage) {
      // Active
      $("#pagination_id").append(`
        <li class="active"><a href="#" onclick="handleChangePage(${index})">${index}</a></li>
        `);
    } else {
      $("#pagination_id").append(`
        <li><a href="#" onclick="handleChangePage(${index})">${index}</a></li>
        `);
    }
  }

  // Hiển thị nút Next
  if (currentPage < totalPages_Param) {
    $("#pagination_id").append(
      `<li class="page-item"><a href="#" class="page-link" onclick="handleNext()">Next</a></li>`
    );
  }

  // Hiển thị nút >> (Last)
  // $("#pagination_id").append(
  //   `<li class="page-item"><a href="#" class="page-link" onclick="handleLast()">>></a></li>`
  // );
}

function handleChangePage(pageParam) {
  // Kiểm tra xem trang có phải trang hiện tại không. Nếu là trang hiện tại thì không làm gì
  if (pageParam == currentPage) {
    return;
  } else {
    currentPage = pageParam;
    getListAccount();
  }
}

function handlePrevious(params) {
  currentPage = currentPage - 1;
  getListAccount();
}

function handleNext(params) {
  currentPage = currentPage + 1;
  getListAccount();
}

function handleFirst(params) {
  currentPage = 1;
  getListAccount();
}

// function handleLast(params) {
//   currentPage = 2;
//   getListAccount();
// }

function getListDepartment(params) {
  $.ajax({
    type: "GET",
    url: "http://localhost:8080/api/v1/departments",
    // data: "data",
    dataType: "json",
    beforeSend: function (xhr) {
      xhr.setRequestHeader(
        "Authorization",
        "Basic " +
          btoa(
            localStorage.getItem("username_LocalStorage") +
              ":" +
              localStorage.getItem("password_LocalStorage")
          )
      );
    },

    success: function (response) {
      console.log("Response Department: ", response);
      listDepartment = response;

      for (let index = 0; index < listDepartment.length; index++) {
        $("#SelectDep_ID").append(
          `<option value="${listDepartment[index].id}">${listDepartment[index].name}</option>`
        );
      }
    },
  });
}

function getListPosition(params) {
  $.ajax({
    url: "http://localhost:8080/api/v1/positions",
    type: "GET",
    // data: "data",
    contentType: "application/json",
    dataType: "json",
    beforeSend: function (xhr) {
      xhr.setRequestHeader(
        "Authorization",
        "Basic " +
          btoa(
            localStorage.getItem("username_LocalStorage") +
              ":" +
              localStorage.getItem("password_LocalStorage")
          )
      );
    },

    success: function (response) {
      console.log("Response Position: ", response);
      listPosition = response;

      for (let index = 0; index < listPosition.length; index++) {
        $("#SelectPos_ID").append(
          `<option value="${listPosition[index].id}">${listPosition[index].name}</option>`
        );
      }
    },
  });
}

$("#reset_btn").click(function (e) {
  // console.log("log");
  $("#ID_ID").val("");
  $("#Email_ID").val("");
  $("#Username_ID").val("");
  $("#Fullname_ID").val("");
  $("#SelectDep_ID").val("");
  $("#SelectPos_ID").val("");
  $("#CreateDate_ID").val("");
});

$("#save_btn").click(function (e) {
  var v_ID_ID = $("#ID_ID").val();
  var v_Email_ID = $("#Email_ID").val();
  var v_Username_ID = $("#Username_ID").val();
  var v_Fullname_ID = $("#Fullname_ID").val();
  var v_SelectDep_ID = $("#SelectDep_ID").val();
  var v_SelectPos_ID = $("#SelectPos_ID").val();
  // var v_CreateDate_ID = $("#CreateDate_ID").val();

  console.log(v_ID_ID);

  // var account = {
  //   Id: v_ID_ID,
  //   Email: v_Email_ID,
  //   Username: v_Username_ID,
  //   Fullname: v_Fullname_ID,
  //   SelectDep: v_SelectDep_ID,
  //   SelectPos: v_SelectPos_ID,
  //   CreateDate: v_CreateDate_ID,
  // };

  // listAccount.push(account);

  // showListAccount();

  var account_new = {
    email: v_Email_ID,
    username: v_Username_ID,
    fullname: v_Fullname_ID,
    departmentId: v_SelectDep_ID,
    positionId: v_SelectPos_ID,
  };

  // call API để tạo mới account
  $.ajax({
    type: "POST",
    url: "http://localhost:8080/api/v1/accounts",
    data: JSON.stringify(account_new),
    contentType: "application/json; charset=UTF-8",
    beforeSend: function (xhr) {
      xhr.setRequestHeader(
        "Authorization",
        "Basic " +
          btoa(
            localStorage.getItem("username_LocalStorage") +
              ":" +
              localStorage.getItem("password_LocalStorage")
          )
      );
    },

    success: function (response) {
      getListAccount(); // hiển thị lại danh sách account
    },
  });
});

function showListAccount() {
  $("#Result_TB").empty();

  for (let index = 0; index < listAccount.length; index++) {
    $("#Result_TB").append(
      ` <tr>
    <td>${listAccount[index].Id}</td>
    <td>${listAccount[index].Email}</td>
    <td>${listAccount[index].Username}</td>
    <td>${listAccount[index].Fullname}</td>
    <td>${listAccount[index].SelectDep}</td>
    <td>${listAccount[index].SelectPos}</td>
    <td>${listAccount[index].CreateDate}</td>
    <td>
      <button type="button" class="btn btn-warning" onclick="editAccount(${index})">
        Edit
      </button>
    </td>
    <td>
      <button type="button" class="btn btn-danger" onclick="deleteAccount(${index})">
        Delete
      </button>
    </td>
    <td>
      <button type="button" class="btn btn-info" onclick="duplicateAccount(${index})">
        Duplicate
      </button>
    </td>
  </tr>
  `
    );
  }
}

function deleteAccount(indexDel) {
  var result = confirm("bạn có chắc chắn muốn xóa không?");

  if (result) {
    // listAccount.splice(indexDel, 1);
    // showListAccount();

    var v_id_delete = listAccount[indexDel].id;
    $.ajax({
      type: "DELETE",
      url: "http://localhost:8080/api/v1/accounts/" + v_id_delete,
      beforeSend: function (xhr) {
        xhr.setRequestHeader(
          "Authorization",
          "Basic " +
            btoa(
              localStorage.getItem("username_LocalStorage") +
                ":" +
                localStorage.getItem("password_LocalStorage")
            )
        );
      },

      success: function (response) {
        getListAccount();
      },
    });
  } else {
    return;
  }
}

function editAccount(indexEdit) {
  $("#ID_ID").attr("disabled", "disabled");
  $("#Email_ID").attr("disabled", "disabled");
  $("#Username_ID").attr("disabled", "disabled");

  // "id": 1,
  // "email": "Email1@gmail.com",
  // "username": "Username1",
  // "fullname": "Fullname1",
  // "department": "Kỹ thuật",
  // "position": "Dev",
  // "createDate": "2023-03-04"

  //tìm id của department
  var v_DepId;
  for (let index = 0; index < listDepartment.length; index++) {
    if (listDepartment[index].name === listAccount[indexEdit].department) {
      v_DepId = listDepartment[index].id;
    }
  }
  // tìm id của position
  var v_PosId;
  for (let index = 0; index < listPosition.length; index++) {
    if (listPosition[index].name === listAccount[indexEdit].position) {
      v_PosId = listPosition[index].id;
    }
  }

  $("#ID_ID").val(listAccount[indexEdit].id);
  $("#Email_ID").val(listAccount[indexEdit].email);
  $("#Username_ID").val(listAccount[indexEdit].username);
  $("#Fullname_ID").val(listAccount[indexEdit].fullname);
  $("#SelectDep_ID").val(v_DepId);
  $("#SelectPos_ID").val(v_PosId);
  $("#CreateDate_ID").val(listAccount[indexEdit].createDate);

  indexAccountUpdate = indexEdit;
}

// xử lý khi người dùng update account
$("#update_btn").click(function () {
  var v_ID_ID = $("#ID_ID").val();
  var v_Email_ID = $("#Email_ID").val();
  var v_Username_ID = $("#Username_ID").val();
  var v_Fullname_ID = $("#Fullname_ID").val();
  var v_SelectDep_ID = $("#SelectDep_ID").val();
  var v_SelectPos_ID = $("#SelectPos_ID").val();
  var v_CreateDate_ID = $("#CreateDate_ID").val();

  var account_update = {
    fullname: v_Fullname_ID,
    departmentId: v_SelectDep_ID,
    positionId: v_SelectPos_ID,
  };

  // call API để update dữ liệu
  $.ajax({
    type: "PUT",
    url: "http://localhost:8080/api/v1/accounts/" + v_ID_ID,
    data: JSON.stringify(account_update),
    contentType: "application/json; charset=UTF-8",
    beforeSend: function (xhr) {
      xhr.setRequestHeader(
        "Authorization",
        "Basic " +
          btoa(
            localStorage.getItem("username_LocalStorage") +
              ":" +
              localStorage.getItem("password_LocalStorage")
          )
      );
    },

    success: function (response) {
      getListAccount();
    },
  });
  // tìm account cần update

  // var indexAccountUpdate = 0;
  // for (let index = 0; index < listAccount.length; index++) {
  //   if (listAccount[index].Id == v_ID_ID) {
  //     indexAccountUpdate = index;
  //     break;
  //   }
  // }

  // Update thông tin account
  // listAccount[indexAccountUpdate].Fullname = v_Fullname_ID;
  // listAccount[indexAccountUpdate].SelectDep = v_SelectDep_ID;
  // listAccount[indexAccountUpdate].SelectPos = v_SelectPos_ID;
  // listAccount[indexAccountUpdate].CreateDate = v_CreateDate_ID;

  // showListAccount();
});

// Duplicate:
// function duplicateAccount(indexDuplicate) {
//   $("#ID_ID").val(listAccount[indexDuplicate].Id);
//   $("#Email_ID").val(listAccount[indexDuplicate].Email);
//   $("#Username_ID").val(listAccount[indexDuplicate].Username);
//   $("#Fullname_ID").val(listAccount[indexDuplicate].Fullname);
//   $("#SelectDep_ID").val(listAccount[indexDuplicate].SelectDep);
//   $("#SelectPos_ID").val(listAccount[indexDuplicate].SelectPos);
//   $("#CreateDate_ID").val(listAccount[indexDuplicate].CreateDate);
//   $("#save_btn").click(function () {
//     var v_ID_ID = $("#ID_ID").val();
//     var v_Email_ID = $("#Email_ID").val();
//     var v_Username_ID = $("#Username_ID").val();
//     var v_Fullname_ID = $("#Fullname_ID").val();
//     var v_SelectDep_ID = $("#SelectDep_ID").val();
//     var v_SelectPos_ID = $("#SelectPos_ID").val();
//     var v_CreateDate_ID = $("#CreateDate_ID").val();
//   });
//   listAccount[indexDuplicate].Id = v_Fullname_ID;
//   listAccount[indexDuplicate].Email = v_Fullname_ID;
//   listAccount[indexDuplicate].Username = v_Fullname_ID;
//   listAccount[indexDuplicate].Fullname = v_Fullname_ID;
//   listAccount[indexDuplicate].SelectDep = v_SelectDep_ID;
//   listAccount[indexDuplicate].SelectPos = v_SelectPos_ID;
//   listAccount[indexDuplicate].CreateDate = v_CreateDate_ID;
//   showListAccount();
// }

function handleSort(sortFieldParam) {
  if (sortFieldParam === sortField) {
    isAsc = !isAsc;
  } else {
    sortField = sortFieldParam;
    isAsc = true;
  }
  getListAccount();
}

// Hàm xử lý search data
function handleSearch(params) {
  //lấy dữ liệu search
  var dataSearch = $("#Search_input").val();
  v_search = dataSearch;
  getListAccount();
}

// hàm xử lý login
function handleLogin(params) {
  // lấy thông tin người dùng nhập
  var v_username_Login = $("#Username_Login_Id").val();
  var v_password_Login = $("#Password_Login_Id").val();
  console.log(Username_Login_Id);
  // gửi request
  $.ajax({
    type: "GET",
    url: "http://localhost:8080/api/v1/login",
    // contentType: "application/json",
    // dataType: "json",
    beforeSend: function (xhr) {
      xhr.setRequestHeader(
        "Authorization",
        "Basic " + btoa(v_username_Login + ":" + v_password_Login)
      );
      // xhr.setRequestHeader(
      //   "Authorization",
      //   "Basic " + btoa("Username1:123456")
      // );
    },

    success: function (response) {
      // console.log("response" + response);
      // console.log("OKKKKKKKKKKKKKKKK");

      //lưu thông tin đăng nhập của user vào local storage
      localStorage.setItem("username_LocalStorage", v_username_Login);
      localStorage.setItem("password_LocalStorage", v_password_Login);

      window.open("AdminAccount.html", "_self");
    },
  });
}
